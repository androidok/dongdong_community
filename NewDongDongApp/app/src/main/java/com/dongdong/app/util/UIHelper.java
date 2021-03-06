package com.dongdong.app.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.dongdong.app.AppConfig;
import com.dongdong.app.MainActivity;
import com.dongdong.app.ui.ApplyKeyActivity;
import com.dongdong.app.ui.BulletinActivity;
import com.dongdong.app.ui.CommonPhoneActivity;
import com.dongdong.app.ui.DeviceListActivity;
import com.dongdong.app.ui.FinanceActivity;
import com.dongdong.app.ui.ParkingActivity;
import com.dongdong.app.ui.RepairsActivity;
import com.dongdong.app.ui.ShakeOpenDoorActivity;
import com.dongdong.app.ui.VideoViewActivity;
import com.dongdong.app.ui.OpenDoorActivity;
import com.dongdong.app.ui.VisitorPhotoActivity;

public class UIHelper {

    public static void showMainActivity(Context context, String deviceID) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Bundle bundle = new Bundle();
        bundle.putString(AppConfig.BUNDLE_KEY_DEVICE_ID, deviceID);
        intent.putExtra(AppConfig.INTENT_BUNDLE_KEY, bundle);
        context.startActivity(intent);
    }

    public static void showMainActivityWithPushTime(Context context, String deviceID, String pushTime) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Bundle bundle = new Bundle();
        bundle.putString(AppConfig.BUNDLE_KEY_DEVICE_ID, deviceID);
        bundle.putString(AppConfig.BUNDLE_KEY_PUSH_TIME, pushTime);
        intent.putExtra(AppConfig.INTENT_BUNDLE_KEY, bundle);
        context.startActivity(intent);
    }

    public static void showDeviceListActivity(Context context) {
        Intent intent = new Intent(context, DeviceListActivity.class);
        context.startActivity(intent);
    }

    public static void showBulletinActivity(Context context) {
        Intent intent = new Intent(context, BulletinActivity.class);
        context.startActivity(intent);
    }

    public static void showCommonPhoneActivity(Context context) {
        Intent intent = new Intent(context, CommonPhoneActivity.class);
        context.startActivity(intent);
    }

    /**
     * 启动门禁视频界面
     *
     * @param context  程序运行上下文
     * @param isActive 是否主动监视
     * @param deviceID 设备ID
     */
    public static void showVideoViewActivity(Context context, boolean isActive, String deviceID) {
        Intent intent = new Intent(context, VideoViewActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Bundle bundle = new Bundle();
        bundle.putBoolean(AppConfig.BUNDLE_KEY_INITIATIVE, isActive);
        bundle.putString(AppConfig.BUNDLE_KEY_DEVICE_ID, deviceID);
        intent.putExtra(AppConfig.INTENT_BUNDLE_KEY, bundle);
        context.startActivity(intent);
    }

    public static void showApplyKeyActivity(Context context) {
        Intent intent = new Intent(context, ApplyKeyActivity.class);
        context.startActivity(intent);
    }

    public static void showVisitorRecordActivity(Context context) {
        Intent intent = new Intent(context, OpenDoorActivity.class);
        context.startActivity(intent);
    }

    public static void showHomeSafeActivity(Context context) {
        Intent intent = new Intent(context, VisitorPhotoActivity.class);
        context.startActivity(intent);
    }

    public static void showParkingActivity(Context context) {
        Intent intent = new Intent(context, ParkingActivity.class);
        context.startActivity(intent);
    }

    public static void showFinanceActivity(Context context) {
        Intent intent = new Intent(context, FinanceActivity.class);
        context.startActivity(intent);
    }

    public static void showRepairsActivity(Context context) {
        Intent intent = new Intent(context, RepairsActivity.class);
        context.startActivity(intent);
    }

    public static void showShakeOpenDoorActivity(Context context) {
        Intent intent = new Intent(context, ShakeOpenDoorActivity.class);
        context.startActivity(intent);
    }
}
