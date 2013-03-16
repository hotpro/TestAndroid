package com.test.testandroid;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestWifiActivity extends BaseActivity implements OnClickListener {

	private Button btnSwitchWifi;
	private WifiManager wifiManager;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.test_wifi);
		btnSwitchWifi = (Button) findViewById(R.id.btn_switch_wifi);
		btnSwitchWifi.setOnClickListener(this);
		wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
		btnSwitchWifi.setText(wifiManager.isWifiEnabled() ? "已开" : "已关");
	}

	@Override
	public void onClick(View view) {
		if (wifiManager.isWifiEnabled()) {
			wifiManager.setWifiEnabled(false);
			btnSwitchWifi.setText("已关");
		} else {
			wifiManager.setWifiEnabled(true);
			btnSwitchWifi.setText("已开");
		}
	}

}
