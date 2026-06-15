package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.3O  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C3O extends Handler {
    public static byte[] A09;
    public static String[] A0A = {"huWs6nyYMzfxZtpl5l", "fgwmKB6Qyc6FtxfQKB9IkKk97cCBhoPq", "Jv452jFQqMHbXRCew", "VJzjxvVEvnwAHRNG0UVfEBBm35lAgOcC", "2O55YLspBlua8aaDjHW6JYUsijhI69vr", "eg8WpOT66b5I3PrsSw6YGr9", "zIsMPTJraAXX1U7X8ddpQ67iDmaNCfrq", "78M1aKJi48odvK"};
    public Messenger A00;
    public CZ A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final InterfaceC04311f A06;
    public final C1899k0 A07;
    public final BY A08;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-102, -83, -85, -83, -79, -66, -83, -84, 104, -80, -87, -74, -84, -69, -80, -87, -77, -83, 104, -82, -87, -79, -76, -83, -84, 116, 104, -85, -73, -84, -83, -126, 104, -116, -115, -117, -104, -119, 122, 124, -124, 122, Byte.MIN_VALUE, 126, -104, 122, -123, -117, 126, 122, 125, -110, -104, 126, -111, -126, -116, -115, -116, -104, -124, 126, -110, 0, 1, -1, 12, -3, -18, -16, -8, -18, -12, -14, 12, -10, -5, 0, 1, -18, -7, -7, -14, -15, 12, -8, -14, 6, -28, -27, -29, -16, -31, -46, -44, -36, -46, -40, -42, -16, -36, -42, -22};
    }

    static {
        A06();
    }

    public C3O(C1899k0 c1899k0) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnection() { // from class: com.facebook.ads.redexgen.X.3N
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Handler handler;
                BY by;
                C1899k0 c1899k02;
                Messenger messenger;
                handler = C3O.this.A04;
                by = C3O.this.A08;
                handler.removeCallbacks(by);
                C3O.this.A00 = new Messenger(iBinder);
                c1899k02 = C3O.this.A07;
                if (AbstractC06449p.A07(c1899k02)) {
                    C3O c3o = C3O.this;
                    messenger = C3O.this.A00;
                    c3o.A07(messenger);
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                C3O.this.A09();
            }
        };
        this.A07 = c1899k0;
        this.A05 = new Messenger(this);
        InterfaceC04351j funnelModule = c1899k0.A00(c1899k0);
        if (funnelModule != null) {
            this.A06 = funnelModule.ABi();
        } else {
            this.A06 = new C2102nL();
        }
        this.A08 = new C2007lo(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Messenger messenger) {
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = this.A05;
        obtain.setData(C3X.A00(this.A07));
        try {
            messenger.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    public final void A09() {
        if (this.A02) {
            this.A02 = false;
            this.A07.unbindService(this.A03);
            this.A00 = null;
        }
    }

    public final void A0A(String str, CZ cz, int i10) {
        if (this.A02) {
            this.A06.AHT(i10);
            this.A01 = cz;
            Message obtain = Message.obtain((Handler) null, i10);
            obtain.replyTo = this.A05;
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(A05(88, 15, 88), str);
                obtain.setData(bundle);
            }
            try {
                if (this.A00 != null) {
                    this.A00.send(obtain);
                    return;
                }
                return;
            } catch (RemoteException e8) {
                this.A06.AHU(e8.toString());
                return;
            }
        }
        InterfaceC04311f interfaceC04311f = this.A06;
        if (A0A[3].charAt(16) != '0') {
            throw new RuntimeException();
        }
        A0A[1] = "UrwnsONYHFKEsBm1tj1C3JCQoMa7O9rm";
        interfaceC04311f.AHV();
    }

    public final void A0B(boolean z10) {
        this.A06.AHQ();
        this.A02 = C3M.A04(this.A07, z10, this.A03);
        if (this.A02) {
            Messenger messenger = this.A00;
            if (A0A[2].length() != 17) {
                throw new RuntimeException();
            }
            A0A[6] = "P62SHD49IwhaYJMd1yj6mhn8O1XS0mYq";
            if (messenger == null) {
                this.A04.postDelayed(this.A08, AbstractC06449p.A01(this.A07));
                return;
            }
            return;
        }
        AnonymousClass92.A04(this.A07);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                C3M.A02(this.A07, message);
                this.A06.AHP();
            } else if (message.what == 20 || message.what == 40 || message.what == 30) {
                this.A06.AHR(message.what);
                if (message.what == 20) {
                    AbstractC06449p.A06(this.A07);
                }
                String str = A05(0, 33, 15) + message.what;
                AnonymousClass92.A04(this.A07);
            } else if (message.what == 4) {
                this.A06.AHS();
                Bundle data = message.getData();
                if (this.A01 != null) {
                    boolean z10 = data.getBoolean(A05(33, 30, 0), false);
                    String A05 = A05(88, 15, 88);
                    if (A0A[3].charAt(16) != '0') {
                        throw new RuntimeException();
                    }
                    A0A[0] = "zzNr3SVv6qtYyPyvWR";
                    if (z10) {
                        this.A01.AEK(data.getString(A05));
                    } else if (data.getBoolean(A05(63, 25, 116), false)) {
                        this.A01.AEL(data.getString(A05));
                    }
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
