package com.startapp.sdk.ads.video;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.google.protobuf.CodedOutputStream;
import com.startapp.o9;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.y;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class VideoUtil {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum VideoEligibility {
        ELIGIBLE(""),
        INELIGIBLE_NO_STORAGE("Not enough storage for video"),
        INELIGIBLE_MISSING_ACTIVITY("OverlayActivity not declared in AndroidManifest.xml"),
        INELIGIBLE_ERRORS_THRESHOLD_REACHED("Video errors threshold reached.");
        
        private String desctiption;

        VideoEligibility(String str) {
            this.desctiption = str;
        }

        public final String a() {
            return this.desctiption;
        }
    }

    public static VideoEligibility a(Context context) {
        boolean z10;
        VideoEligibility videoEligibility = VideoEligibility.ELIGIBLE;
        boolean z11 = true;
        if (AdsCommonMetaData.f22889h.G().p() >= 0 && com.startapp.sdk.components.a.a(context).E.a().getInt("videoErrorsCount", 0) >= AdsCommonMetaData.f22889h.G().p()) {
            videoEligibility = VideoEligibility.INELIGIBLE_ERRORS_THRESHOLD_REACHED;
        }
        WeakHashMap weakHashMap = o9.f22359a;
        try {
            for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                    z10 = true;
                    break;
                }
            }
        } catch (Exception unused) {
        }
        z10 = false;
        if (!z10) {
            videoEligibility = VideoEligibility.INELIGIBLE_MISSING_ACTIVITY;
        }
        File filesDir = context.getFilesDir();
        WeakHashMap weakHashMap2 = o9.f22359a;
        long a10 = y.a(filesDir);
        return !((a10 < 0 || a10 / 1024 <= AdsCommonMetaData.f22889h.G().g() * 1024) ? false : false) ? VideoEligibility.INELIGIBLE_NO_STORAGE : videoEligibility;
    }

    public static String a(Context context, URL url, String str) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        DataInputStream dataInputStream;
        String str2;
        File file;
        DataInputStream dataInputStream2 = null;
        FileOutputStream fileOutputStream2 = null;
        dataInputStream2 = null;
        r2 = null;
        String str3 = null;
        try {
            str2 = context.getFilesDir() + "/" + str;
            file = new File(str2);
        } catch (Exception unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
            fileOutputStream = null;
        }
        if (!file.exists()) {
            inputStream = url.openStream();
            try {
                dataInputStream = new DataInputStream(inputStream);
                try {
                    byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                    fileOutputStream = context.openFileOutput(str + ".temp", 0);
                    while (true) {
                        try {
                            int read = dataInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (Exception unused2) {
                            try {
                                new File(context.getFilesDir() + "/" + (str + ".temp")).delete();
                                try {
                                    inputStream.close();
                                    dataInputStream.close();
                                    fileOutputStream.close();
                                    return str3;
                                } catch (Exception unused3) {
                                    return str3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataInputStream2 = dataInputStream;
                                dataInputStream = dataInputStream2;
                                fileOutputStream2 = fileOutputStream;
                                try {
                                    inputStream.close();
                                    dataInputStream.close();
                                    fileOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream2 = fileOutputStream;
                            inputStream.close();
                            dataInputStream.close();
                            fileOutputStream2.close();
                            throw th;
                        }
                    }
                    new File(context.getFilesDir() + "/" + (str + ".temp")).renameTo(file);
                    try {
                        inputStream.close();
                        str3 = str2;
                    } catch (Exception unused5) {
                        return str2;
                    }
                } catch (Exception unused6) {
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream.close();
                    dataInputStream.close();
                    fileOutputStream2.close();
                    throw th;
                }
            } catch (Exception unused7) {
                dataInputStream = null;
                fileOutputStream = null;
                new File(context.getFilesDir() + "/" + (str + ".temp")).delete();
                inputStream.close();
                dataInputStream.close();
                fileOutputStream.close();
                return str3;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                dataInputStream = dataInputStream2;
                fileOutputStream2 = fileOutputStream;
                inputStream.close();
                dataInputStream.close();
                fileOutputStream2.close();
                throw th;
            }
            dataInputStream.close();
            fileOutputStream.close();
            return str3;
        }
        try {
            throw null;
        } catch (Exception unused8) {
            return str2;
        }
    }
}
