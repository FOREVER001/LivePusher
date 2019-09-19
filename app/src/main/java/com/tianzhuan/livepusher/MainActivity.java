package com.tianzhuan.livepusher;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CameraHelper mCameraHelper;
    private SurfaceView mSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSurfaceView=findViewById(R.id.surfaceView);
        mCameraHelper=new CameraHelper(this, Camera.CameraInfo.CAMERA_FACING_BACK,480,800);
        mCameraHelper.setPreviewDisplay(mSurfaceView.getHolder());
    }

    public native String stringFromJNI();

    /**
     * 切换摄像头
     * @param view
     */
    public void switchCamera(View view) {
        mCameraHelper.switchCamera();
    }

    /**
     * 开始直播
     * @param view
     */
    public void startLive(View view) {

    }

    /**
     * 停止直播
     * @param view
     */
    public void stopLive(View view) {

    }
}
