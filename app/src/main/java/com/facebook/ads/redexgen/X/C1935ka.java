package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;
/* renamed from: com.facebook.ads.redexgen.X.ka  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1935ka implements InterfaceC0799Gg {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1930kV A01;
    public final /* synthetic */ C1816ie A02;

    public C1935ka(C1930kV c1930kV, C1816ie c1816ie, NativeAd nativeAd) {
        this.A01 = c1930kV;
        this.A02 = c1816ie;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void AAc() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void AD1(LI li) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1936kb(this, li), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void ADH() {
        LI li;
        LI li2;
        li = this.A01.A0A;
        if (li != null) {
            li2 = this.A01.A0A;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            li2.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void AFK(View view, MotionEvent motionEvent) {
        C1900k1 c1900k1;
        boolean A0J;
        C0710Cv A1A = this.A02.A1A();
        c1900k1 = this.A01.A07;
        A1A.A06(c1900k1, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A13() != null) {
                this.A02.A13().onClick(view);
            }
        }
    }
}
