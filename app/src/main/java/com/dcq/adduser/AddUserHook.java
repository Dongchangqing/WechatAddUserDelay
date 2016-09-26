package com.dcq.adduser;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by dcq on 2016/6/8 0008.
 */
public class AddUserHook implements IXposedHookLoadPackage {
    protected SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        if (!"com.tencent.mm".equals(loadPackageParam.packageName)) {
            return;
        }
        //打印日志
      /*XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.d", loadPackageParam.classLoader,"a",
                Bitmap.class,int.class,Bitmap.CompressFormat.class,String.class,boolean.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime(".sdk.platformtools.d0："+param.args[0].toString());
                        writeContentTime(".sdk.platformtools.d1："+param.args[1].toString());
                        writeContentTime(".sdk.platformtools.d2："+param.args[2].toString());
                        writeContentTime(".sdk.platformtools.d3："+param.args[3].toString());
                        writeContentTime(".sdk.platformtools.d4："+param.args[4].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.u", loadPackageParam.classLoader, "d", String.class, String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("platformtools.u:dd0：" + param.args[0].toString());
                        writeContentTime("platformtools.u:dd1：" + param.args[1].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.u", loadPackageParam.classLoader, "i", String.class, String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("platformtools.u:ii0：" + param.args[0].toString());
                        writeContentTime("platformtools.u:ii1：" + param.args[1].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.u", loadPackageParam.classLoader, "f", String.class, String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("platformtools.u:ff0：" + param.args[0].toString());
                        writeContentTime("platformtools.u:ff1：" + param.args[1].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.u", loadPackageParam.classLoader, "e", String.class, String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("platformtools.u:ee0：" + param.args[0].toString());
                        writeContentTime("platformtools.u:ee1：" + param.args[1].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.u", loadPackageParam.classLoader, "w", String.class, String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("platformtools.u:ww0：" + param.args[0].toString());
                        writeContentTime("platformtools.u:ww1：" + param.args[1].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.u", loadPackageParam.classLoader, "v", String.class, String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("platformtools.u:vv0：" + param.args[0].toString());
                        writeContentTime("platformtools.u:vv1：" + param.args[1].toString());
                    }
                });*/

        XposedHelpers.findAndHookMethod("com.tencent.mm.ab.m", loadPackageParam.classLoader, "a", int.class, int.class, String.class, String.class,
                boolean.class, int.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("ab.m.a2数据库0：" + param.args[0].toString());
                        writeContentTime("ab.m.a2数据库1：" + param.args[1].toString());
                        writeContentTime("ab.m.a2数据库2：" + param.args[2].toString());
                        writeContentTime("ab.m.a2数据库3：" + param.args[3].toString());
                        writeContentTime("ab.m.a2数据库4：" + param.args[4].toString());
                        writeContentTime("ab.m.a2数据库5：" + param.args[5].toString());
                    }
                });


        XposedHelpers.findAndHookMethod("com.tencent.mm.storage.ag", loadPackageParam.classLoader, "by", int.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                       writeContentTime("storage.ag：by先1--2===" + param.args[0].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.d.b.bg", loadPackageParam.classLoader, "by", int.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("storage.d.b.bg：by===?" + param.args[0].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.d.b.bg", loadPackageParam.classLoader, "setType", int.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("storage.d.b.bg：setType===?" + param.args[0].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.d.b.bg", loadPackageParam.classLoader, "setTalker", String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("storage.d.b.bg：setTalker===?" + param.args[0].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.d.b.bg", loadPackageParam.classLoader, "setContent", String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("storage.d.b.bg：setContent===?" + param.args[0].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.d.b.bg", loadPackageParam.classLoader, "cx", String.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("storage.d.b.bg：cx===?" + param.args[0].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.d.b.bg", loadPackageParam.classLoader, "bI", int.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        writeContentTime("storage.d.b.bg：bI===?" + param.args[0].toString());
                    }
                });
        XposedHelpers.findAndHookMethod("com.tencent.mm.d.b.bg", loadPackageParam.classLoader, "bJ", int.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                       writeContentTime("storage.d.b.bg：bJ===?" + param.args[0].toString());
                    }
                });
    }
    //写文件
    public void writeContentTime(String sb) {
        sb = sb + "--" + timeFormat.format(new Date()) + "\r\n";
        //sbs.append(sb).append("--").append(timeFormat.format(new Date())).append("\r\n");
        try {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                String path = Environment.getExternalStorageDirectory() + File.separator + "wechatcrm" + File.separator + "crash";
                File dir = new File(path);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File outFile = new File(path + File.separator + "wechatLog1");

                if (!outFile.exists()) {
                    outFile.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(outFile, true);//追加进入
                fos.write(sb.toString().getBytes());
                fos.flush();
                fos.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
