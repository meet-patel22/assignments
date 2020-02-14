

package com.factory.pattern;

import com.factory.pattern.*;

public class MainFactory
{
	public static void main(String []args)
	{
		OsFactory osf=new OsFactory();
		
		Os obj=osf.getInstance("lessinuse");
		obj.aboutOs();
	}
}