package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.hg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.unity3d.services.core.device.MimeTypes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioManager f20465a;

        a(AudioManager audioManager) {
            this.f20465a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f20465a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioManager f20466a;

        b(AudioManager audioManager) {
            this.f20466a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.d(this.f20466a);
        }
    }

    t() {
    }

    public static void a(Activity activity) {
        hg.f17676a.b(new a((AudioManager) activity.getSystemService(MimeTypes.BASE_TYPE_AUDIO)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public static void b(Activity activity) {
        hg.f17676a.b(new b((AudioManager) activity.getSystemService(MimeTypes.BASE_TYPE_AUDIO)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
