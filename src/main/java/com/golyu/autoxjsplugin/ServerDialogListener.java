package com.golyu.autoxjsplugin;

import com.golyu.autoxjsplugin.jb.Device;

import java.util.Set;

public interface ServerDialogListener {
    //更新二维码
    void updateQrCode(String text);

    //更新服务状态
    void updateServerStatus(Boolean status);

    //更新设备列表
    void updateDeviceList(Set<Device> devices);
}
