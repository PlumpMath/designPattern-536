package org.yp.adapter;

public class IpadAdapter implements IpadApp{
	private IphoneApp iphoneApp;
	public IpadAdapter(IphoneApp iphoneApp) {
		this.iphoneApp = iphoneApp;
	}
	
	public void play() {
		iphoneApp.play();
	}
}
