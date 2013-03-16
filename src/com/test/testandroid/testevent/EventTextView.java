package com.test.testandroid.testevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public class EventTextView extends TextView {

	public EventTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public EventTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public EventTextView(Context context) {
		super(context);
	}

	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		System.out.println("EventTextView::onTouchEvent::action=" + Tool.getTouchAction(event.getAction()));
		return super.onTouchEvent(event);
//		return true;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		System.out.println("EventTextView::onKeyDown::key=" + keyCode);
		return super.onKeyDown(keyCode, event);
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		System.out.println("EventTextView::onKeyUp::key=" + keyCode);
		return super.onKeyUp(keyCode, event);
	}
}
