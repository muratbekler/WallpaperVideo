using Android.App;
using Android.Content;
using Android.Media;
using Android.Service.Wallpaper;
using Android.Views;
[assembly: Permission(Name = "android.permission.BIND_WALLPAPER")]
namespace WallpaperVideo.Services
{
    [Service(Name = "com.kodmatik.wallpaper",
        Label = "Video live wallpaper",
        Enabled = true,
        Exported = true,
        DirectBootAware = true,
        Permission = "android.permission.BIND_WALLPAPER")]
    [MetaData("android.service.wallpaper", Resource = "@xml/wallpaper")]
    [IntentFilter(new string[] { "android.service.wallpaper.WallpaperService" })]
    public class VideoWallpaperService : WallpaperService
    {
        public override Engine OnCreateEngine()
        {
            return new VideoEngine(this);
        }
        public class VideoEngine : Engine
        {
            public int playheadTime = 0;
            private MediaPlayer mediaPlayer;
            public VideoEngine(WallpaperService __self) : base(__self)
            {
                //var descriptor = __self.Assets.OpenFd("video.mp4");
                //mediaPlayer = new MediaPlayer();
                //mediaPlayer.SetDataSource(descriptor.FileDescriptor, descriptor.StartOffset, descriptor.Length);
                //mediaPlayer.Looping = true;
                mediaPlayer = MediaPlayer.Create(MainActivity.Context, Resource.Drawable.FMS);
                mediaPlayer.Looping = true;
            }
            public override void OnSurfaceCreated(ISurfaceHolder holder)
            {
                base.OnSurfaceCreated(holder);
                mediaPlayer.SetSurface(holder.Surface);
                mediaPlayer.Start();
            }
            public override void OnSurfaceDestroyed(ISurfaceHolder holder)
            {
                base.OnSurfaceDestroyed(holder);
                playheadTime = mediaPlayer.CurrentPosition;
                mediaPlayer.Reset();
                mediaPlayer.Release();
            }
        }
    }
}