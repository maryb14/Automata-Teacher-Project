package md5e700a33d7957afb14167d0dd52202238;


public class Quiz4Activity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Automata_Teacher_3.Quiz4Activity, Automata Teacher 3, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Quiz4Activity.class, __md_methods);
	}


	public Quiz4Activity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Quiz4Activity.class)
			mono.android.TypeManager.Activate ("Automata_Teacher_3.Quiz4Activity, Automata Teacher 3, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
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