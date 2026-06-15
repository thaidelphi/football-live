package com.startapp.sdk.adsbase.mraid.bridge;

import android.app.Activity;
import com.startapp.l3;
import com.startapp.l5;
import com.startapp.r5;
import com.startapp.y;
import java.net.URLDecoder;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a implements l5 {
    private static final String LOG_TAG = "a";
    protected InterfaceC0252a openListener;

    /* compiled from: Sta */
    /* renamed from: com.startapp.sdk.adsbase.mraid.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0252a {
        boolean onClickEvent(String str);
    }

    public a(InterfaceC0252a interfaceC0252a) {
        this.openListener = interfaceC0252a;
    }

    public void applyOrientationProperties(Activity activity, r5 r5Var) {
        try {
            int i10 = 0;
            int i11 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i12 = r5Var.f22467b;
            if (i12 == 0) {
                i10 = 1;
            } else if (i12 != 1) {
                i10 = r5Var.f22466a ? -1 : i11;
            }
            int i13 = y.f23556a;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    @Override // com.startapp.l5
    public abstract void close();

    @Override // com.startapp.l5
    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    @Override // com.startapp.l5
    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    @Override // com.startapp.l5
    public boolean open(String str) {
        try {
            String trim = URLDecoder.decode(str, "UTF-8").trim();
            if (trim.startsWith("sms")) {
                return openSMS(trim);
            }
            if (trim.startsWith("tel")) {
                return openTel(trim);
            }
            return this.openListener.onClickEvent(trim);
        } catch (Exception unused) {
            return this.openListener.onClickEvent(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported("tel");
        return true;
    }

    @Override // com.startapp.l5
    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    @Override // com.startapp.l5
    public void resize() {
    }

    @Override // com.startapp.l5
    public void setExpandProperties(Map<String, String> map) {
    }

    @Override // com.startapp.l5
    public abstract void setOrientationProperties(Map<String, String> map);

    @Override // com.startapp.l5
    public void setResizeProperties(Map<String, String> map) {
    }

    @Override // com.startapp.l5
    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    @Override // com.startapp.l5
    public abstract void useCustomClose(String str);
}
