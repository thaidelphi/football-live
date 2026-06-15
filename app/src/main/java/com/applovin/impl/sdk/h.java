package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.h;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: h  reason: collision with root package name */
    public static int f8866h = -1;

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f8867a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8868b;

    /* renamed from: c  reason: collision with root package name */
    private final j f8869c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f8870d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Object f8871e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f8872f;

    /* renamed from: g  reason: collision with root package name */
    private int f8873g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j jVar) {
        this.f8869c = jVar;
        Context m7 = j.m();
        this.f8868b = m7;
        this.f8867a = (AudioManager) m7.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void c() {
        this.f8869c.I();
        if (n.a()) {
            this.f8869c.I().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f8868b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int a() {
        return this.f8867a.getRingerMode();
    }

    public void b(a aVar) {
        synchronized (this.f8871e) {
            if (this.f8870d.contains(aVar)) {
                this.f8870d.remove(aVar);
                if (this.f8870d.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f8867a.getRingerMode());
        }
    }

    public void a(a aVar) {
        synchronized (this.f8871e) {
            if (this.f8870d.contains(aVar)) {
                return;
            }
            this.f8870d.add(aVar);
            if (this.f8870d.size() == 1) {
                b();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8872f = true;
            this.f8873g = this.f8867a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f8872f = false;
            if (this.f8873g != this.f8867a.getRingerMode()) {
                this.f8873g = f8866h;
                b(this.f8867a.getRingerMode());
            }
        }
    }

    private void b() {
        this.f8869c.I();
        if (n.a()) {
            this.f8869c.I().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f8873g = f8866h;
        this.f8868b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(final int i10) {
        if (this.f8872f) {
            return;
        }
        this.f8869c.I();
        if (n.a()) {
            n I = this.f8869c.I();
            I.a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f8871e) {
            for (final a aVar : this.f8870d) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a.this.a(i10);
                    }
                });
            }
        }
    }
}
