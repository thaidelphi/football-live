package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.facebook.ads.redexgen.X.Yo  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SurfaceHolder$CallbackC1257Yo implements InterfaceC1727h8, InterfaceC1086Rp, InterfaceC1460cm, InterfaceC1273Ze, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"Z7fFktboAp3k7BlwFx9kKXTgtEqM2", "6t6gPLmMpHTpKPKBFICdS", "Od3oRQxfgGNDNTHMX59YmGVoYglNL2ad", "rr7fBKqADkKZ9sFApFVHjpSFw9Gi3490", "C1v2DgMzcHJoE8RMETWj1", "iL95WQpciADgGkLhpjhDtTNobAHZTPwc", "pr8ytYZQc9t0YNLVJYsHtVxRqGH04BbT", "HzmcmBYNRR6wTRrU4WrkpZWtLSSmNSo0"};
    public final /* synthetic */ C0739Dy A00;

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final /* synthetic */ void ACM(ZM zm, OD od) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final /* synthetic */ void ACN(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final /* synthetic */ void ACO(Exception exc) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final /* synthetic */ void ACk(int i10, long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final /* synthetic */ void AF7(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final /* synthetic */ void AFd(ZM zm, OD od) {
    }

    public SurfaceHolder$CallbackC1257Yo(C0739Dy c0739Dy) {
        this.A00 = c0739Dy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final void ACI(String str, long j10, long j11) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0H;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086Rp) it.next()).ACI(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final void ACJ(OA oa) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0H;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086Rp) it.next()).ACJ(oa);
        }
        this.A00.A09 = null;
        this.A00.A07 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final void ACK(OA oa) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A07 = oa;
        copyOnWriteArraySet = this.A00.A0H;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086Rp) it.next()).ACK(oa);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final void ACL(ZM zm) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A09 = zm;
        copyOnWriteArraySet = this.A00.A0H;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086Rp) it.next()).ACL(zm);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1086Rp
    public final void ACR(int i10, long j10, long j11) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0H;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086Rp) it.next()).ACR(i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1460cm
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACo(C1051Qf c1051Qf) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((QJ) it.next()).ACo(c1051Qf);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1460cm
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACp(List<C1053Qh> list) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[6].charAt(27) == strArr[5].charAt(27)) {
                throw new RuntimeException();
            }
            A01[0] = "rLu";
            if (hasNext) {
                ((QJ) it.next()).ACp(list);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final void AD0(int i10, long j10) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1727h8) it.next()).AD0(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1273Ze
    public final void AE8(Metadata metadata, long j10) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0J;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1273Ze) it.next()).AE8(metadata, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final void AEp(Object obj, long j10) {
        Surface surface;
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        surface = this.A00.A03;
        if (surface == obj) {
            copyOnWriteArraySet2 = this.A00.A0L;
            Iterator it = copyOnWriteArraySet2.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1727h8) it2.next()).AEp(obj, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final void AFV(String str, long j10, long j11) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1727h8) it.next()).AFV(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final void AFW(OA oa) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1727h8) it.next()).AFW(oa);
        }
        this.A00.A0A = null;
        this.A00.A08 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final void AFX(OA oa) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A08 = oa;
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1727h8) it.next()).AFX(oa);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final void AFc(ZM zm) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A0A = zm;
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1727h8) it.next()).AFc(zm);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1727h8
    public final void AFj(Y2 y22) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1711gs) it.next()).AFi(y22.A03, y22.A01, y22.A02, y22.A00);
        }
        copyOnWriteArraySet2 = this.A00.A0K;
        Iterator it2 = copyOnWriteArraySet2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            if (A01[0].length() == 21) {
                throw new RuntimeException();
            }
            A01[0] = "uNNKsXHCcGODr1Xhe75sSycP";
            if (hasNext) {
                ((InterfaceC1727h8) it2.next()).AFj(y22);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
