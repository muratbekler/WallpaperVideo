package com.kodmatik;


public class wallpaper
	extends android.service.wallpaper.WallpaperService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static final String __md_1_methods;
	static {
		__md_methods = 
			"n_onCreateEngine:()Landroid/service/wallpaper/WallpaperService$Engine;:GetOnCreateEngineHandler\n" +
			"";
		mono.android.Runtime.register ("WallpaperVideo.Services.VideoWallpaperService, WallpaperVideo", wallpaper.class, __md_methods);
		__md_1_methods = 
			"n_onSurfaceCreated:(Landroid/view/SurfaceHolder;)V:GetOnSurfaceCreated_Landroid_view_SurfaceHolder_Handler\n" +
			"n_onSurfaceDestroyed:(Landroid/view/SurfaceHolder;)V:GetOnSurfaceDestroyed_Landroid_view_SurfaceHolder_Handler\n" +
			"";
		mono.android.Runtime.register ("WallpaperVideo.Services.VideoWallpaperService+VideoEngine, WallpaperVideo", VideoWallpaperService_VideoEngine.class, __md_1_methods);
	}


	public wallpaper ()
	{
		super ();
		if (getClass () == wallpaper.class)
			mono.android.TypeManager.Activate ("WallpaperVideo.Services.VideoWallpaperService, WallpaperVideo", "", this, new java.lang.Object[] {  });
	}


	public android.service.wallpaper.WallpaperService.Engine onCreateEngine ()
	{
		return n_onCreateEngine ();
	}

	private native android.service.wallpaper.WallpaperService.Engine n_onCreateEngine ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}

public class VideoWallpaperService_VideoEngine
	extends android.service.wallpaper.WallpaperService.Engine
	implements
		mono.android.IGCUserPeer
{


	public VideoWallpaperService_VideoEngine ()
	{
		super ();
		if (getClass () == VideoWallpaperService_VideoEngine.class)
			mono.android.TypeManager.Activate ("WallpaperVideo.Services.VideoWallpaperService+VideoEngine, WallpaperVideo", "WallpaperVideo.Services.VideoWallpaperService, WallpaperVideo", this, new java.lang.Object[] { wallpaper.this });
	}


	public void onSurfaceCreated (android.view.SurfaceHolder p0)
	{
		n_onSurfaceCreated (p0);
	}

	private native void n_onSurfaceCreated (android.view.SurfaceHolder p0);


	public void onSurfaceDestroyed (android.view.SurfaceHolder p0)
	{
		n_onSurfaceDestroyed (p0);
	}

	private native void n_onSurfaceDestroyed (android.view.SurfaceHolder p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
}
