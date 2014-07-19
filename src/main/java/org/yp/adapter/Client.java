package org.yp.adapter;

public class Client {
	public static void main(String[] args) {
		IphoneApp app = new WeiXinApp();
		Ipad myIpad = new Ipad();
		IpadAdapter ipadApp = new IpadAdapter(app);
		myIpad.useIpadApp(ipadApp);
	}
}
