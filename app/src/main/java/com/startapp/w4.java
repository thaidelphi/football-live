package com.startapp;

import com.startapp.sdk.ads.list3d.List3DView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List3DView f23506a;

    public w4(List3DView list3DView) {
        this.f23506a = list3DView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r8 < r9) goto L17;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f23506a
            com.startapp.b2 r1 = r0.f22649l
            if (r1 != 0) goto L7
            return
        L7:
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L70
            com.startapp.sdk.ads.list3d.List3DView r2 = r11.f23506a
            r2.getClass()
            int r3 = r0.getTop()
            int r0 = com.startapp.sdk.ads.list3d.List3DView.a(r0)
            int r3 = r3 - r0
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f23506a
            int r4 = r0.f22644g
            int r3 = r3 - r4
            r2.f22642e = r3
            com.startapp.b2 r0 = r0.f22649l
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r0.f21786e
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L61
            long r4 = r2 - r4
            int r4 = (int) r4
            r5 = 50
            if (r4 <= r5) goto L39
            r4 = r5
        L39:
            r5 = r0
            com.startapp.e8 r5 = (com.startapp.e8) r5
            float r6 = r5.f21783b
            r7 = 0
            float r8 = r5.f21782a
            float r9 = r5.f21784c
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 <= 0) goto L48
            goto L4e
        L48:
            float r9 = r5.f21785d
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 >= 0) goto L50
        L4e:
            float r7 = r9 - r8
        L50:
            float r9 = r5.f21915g
            float r7 = r7 * r9
            float r7 = r7 + r6
            float r4 = (float) r4
            float r4 = r4 * r7
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r6
            float r4 = r4 + r8
            r5.f21782a = r4
            float r4 = r5.f21914f
            float r7 = r7 * r4
            r5.f21783b = r7
        L61:
            r0.f21786e = r2
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f23506a
            com.startapp.b2 r2 = r0.f22649l
            float r2 = r2.f21782a
            int r2 = (int) r2
            int r3 = r0.f22642e
            int r2 = r2 - r3
            r0.a(r2)
        L70:
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f23506a
            com.startapp.b2 r0 = r0.f22649l
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r0.f21783b
            float r3 = java.lang.Math.abs(r3)
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r4 = 1
            if (r3 >= 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r1
        L87:
            float r5 = r0.f21782a
            float r6 = r5 - r2
            float r7 = r0.f21784c
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L9a
            float r5 = r5 + r2
            float r0 = r0.f21785d
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9a
            r0 = r4
            goto L9b
        L9a:
            r0 = r1
        L9b:
            if (r3 == 0) goto La0
            if (r0 == 0) goto La0
            r1 = r4
        La0:
            if (r1 != 0) goto La9
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f23506a
            r1 = 16
            r0.postDelayed(r11, r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.w4.run():void");
    }
}
