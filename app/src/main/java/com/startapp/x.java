package com.startapp;

import android.view.View;
import android.widget.VideoView;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.y;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y.b f23522a;

    public x(ma maVar) {
        this.f23522a = maVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        VideoView videoView;
        ma maVar = (ma) this.f23522a;
        VideoMode videoMode = maVar.f22296a;
        videoMode.W = true;
        if (videoMode.V && videoMode.B()) {
            VideoMode videoMode2 = maVar.f22296a;
            if (!videoMode2.f22752d0 || (videoView = videoMode2.Q) == null) {
                return;
            }
            videoMode2.a(videoView);
        }
    }
}
