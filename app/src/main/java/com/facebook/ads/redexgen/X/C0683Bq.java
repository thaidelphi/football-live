package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.j3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.Bq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0683Bq {
    public static byte[] A00;
    public static String[] A01 = {"WbJlBxxP9hhDyVkliYvNWFvleez5wFba", "Us5Q3ca4sjVLZknlXhQB6hWi1VD5Erza", "gJqO8U9bMVlcsLp5HSGrl2qXu5TMOPYV", "P57OBps6tL2979s4xCAUfWnFOcUQoKvX", "CjMQtwUDrO8ZQ06PzRRzPVuypWFQdtNK", "DynPiig1xYxCb14sB97Y7RAQimyT6aIC", "zcq0zXyldopis2WSYxgyl16P5Uge3oHA", "fUMP1AC"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1900k1> A06;
    public static final AtomicReference<InterfaceC0688Bz> A07;
    public static final AtomicReference<C1> A08;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{89, 54, 51, 57, 32, 40, 54, 51, 40, 56, 53, 61, 40, 62, 51, 40, 60, 50, 46, 57, 86, 83, 89, 64, 72, 88, 69, 94, 80, 94, 89, 86, 91, 72, 82, 79, 67, 69, 86, 68, 21, 122, Byte.MAX_VALUE, 117, 108, 100, 104, 122, 109, 126, Byte.MAX_VALUE, 100, 104, 111, 122, 111, 126, 100, Byte.MAX_VALUE, 122, 111, 122, 75, 121, 110, 125, 124, 56, 107, 108, 121, 108, 125, 56, 122, 109, 118, 124, 116, 125, 56, 113, 107, 56, 125, 117, 104, 108, 97, 57, 23, 21, 2, 41, 3, 2, 31, 26, 26, 21, 36, 24, 23, 18, 30, 21, 15, 36, 15, 20, 16, 30, 21, 100, 104, 106, 41, 97, 102, 100, 98, 101, 104, 104, 108, 41, 102, 99, 116, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 110, 119, 100, 41, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 85, 98, 106, 104, 115, 98, 70, 100, 115, 110, 113, 110, 115, 126, 109, 100, 107, 97, 105, 96, 80, 119, 108, 67, 106, 119, 87, 96, 118, 112, 105, 113, 15, 8, 29, 14, 8, 61, 31, 8, 21, 10, 21, 8, 5, 3, 4, 17, 2, 4, 49, 19, 4, 25, 6, 25, 4, 9, 54, 31, 2, 34, 21, 3, 5, 28, 4};
    }

    static {
        A08();
        A02 = C0683Bq.class.getPackage();
        A04 = A02 + A07(40, 22, 116);
        A03 = A02 + A07(0, 19, 56);
        A05 = A02 + A07(19, 21, 88);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static int A00(C1900k1 c1900k1, Intent intent) throws C0681Bo {
        Intent A012 = A01(intent);
        int usedContext = 0;
        try {
            Activity A002 = ActivityUtils.A00();
            if (A002 == null) {
                A002 = c1900k1.A0E();
                usedContext = 1;
            }
            if (A002 != null) {
                A002.startActivity(A012);
                return usedContext;
            }
            A012.addFlags(268435456);
            c1900k1.startActivity(A012);
            return 2;
        } catch (ActivityNotFoundException e8) {
            throw new C0681Bo(e8);
        }
    }

    public static Intent A01(Intent intent) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(intent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A02(Intent intent, ClassLoader classLoader) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            audienceNetworkActivityBundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(audienceNetworkActivityBundle);
        return cloneFilter;
    }

    public static Bundle A03(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            if (A01[2].charAt(4) != '8') {
                throw new RuntimeException();
            }
            A01[7] = "Zue8yRDoBrDWRSev";
            obtain.recycle();
            return readBundle;
        }
        throw new IllegalStateException(A07(62, 28, 87));
    }

    public static C1900k1 A04(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C1900k1 c1900k1 : A06) {
                String adId = c1900k1.A0F().getId();
                if (stringExtra.equals(adId)) {
                    return c1900k1;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A05(C1900k1 c1900k1) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1900k1.getApplicationContext(), A06());
        adActivityIntent.putExtra(A03, c1900k1.A0F().getId());
        A06.add(c1900k1);
        return adActivityIntent;
    }

    public static Class A06() {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            try {
                return Class.forName(A07(113, 59, 72));
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(e8);
            }
        }
        return AudienceNetworkActivity.class;
    }

    public static void A09(Activity activity, Intent intent) throws C0681Bo {
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e8) {
            throw new C0681Bo(e8);
        }
    }

    public static void A0A(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A0B(C1900k1 c1900k1, AdActivityIntent adActivityIntent) throws C0681Bo {
        Context launchContext;
        Context applicationContext = c1900k1.getApplicationContext();
        if (C06419m.A2T(c1900k1) && (launchContext = c1900k1.A0E()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!A0I(c1900k1, adActivityIntent)) {
                    c1900k1.A0F().AHI();
                    return;
                }
                return;
            }
            applicationContext.startActivity(A01(adActivityIntent));
        } catch (ActivityNotFoundException e8) {
            throw new C0681Bo(e8);
        }
    }

    public static boolean A0C(Intent intent, Set<String> set) {
        Uri intentUri = intent.getData();
        if (intentUri == null) {
            return false;
        }
        String uri = intentUri.toString();
        Iterator<String> it = set.iterator();
        do {
            boolean hasNext = it.hasNext();
            if (A01[5].charAt(30) != 'I') {
                throw new RuntimeException();
            }
            A01[2] = "hOpA8yyYIRQLuX6WeWELRCriZfzSUGqk";
            if (!hasNext) {
                return false;
            }
        } while (!uri.startsWith(it.next()));
        return true;
    }

    public static boolean A0D(C1900k1 c1900k1, Intent intent) throws C0681Bo {
        A07.get();
        return A0F(c1900k1, intent, null);
    }

    public static boolean A0E(C1900k1 c1900k1, Intent intent) throws C0681Bo {
        A07.get();
        if (0 != 0) {
            Activity A0E = c1900k1.A0E();
            if (A01[7].length() == 30) {
                throw new RuntimeException();
            }
            A01[7] = "PLLjYBDqb811z0Dn6rlZ87lQdZ7C";
            if (A0E != null) {
                c1900k1.A0C();
                try {
                    c1900k1.A0E();
                    throw new NullPointerException(A07(j3.c.b.f17913d, 22, 63));
                } catch (ActivityNotFoundException e8) {
                    throw new C0681Bo(e8);
                } catch (Exception e10) {
                    c1900k1.A08().AAu(A07(90, 8, 57), AbstractC06048a.A07, new C06058b(e10));
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean A0F(C1900k1 c1900k1, Intent intent, InterfaceC0688Bz interfaceC0688Bz) throws C0681Bo {
        if (A0C(intent, C06419m.A0Y(c1900k1))) {
            return false;
        }
        Context context = c1900k1;
        if (A01[1].charAt(5) != 'g') {
            A01[2] = "mGLT8eS8inmCxtBfGXr0XCfYNSNKmj30";
            Context startContext = c1900k1.A0E();
            if (startContext != null) {
                context = startContext;
            } else {
                intent.addFlags(268435456);
            }
            if (interfaceC0688Bz != null && !A0C(intent, C06419m.A0a(c1900k1))) {
                c1900k1.A0C();
                try {
                    throw new NullPointerException(A07(190, 13, 51));
                } catch (ActivityNotFoundException e8) {
                    throw new C0681Bo(e8);
                } catch (Exception e10) {
                    c1900k1.A08().AAu(A07(90, 8, 57), AbstractC06048a.A08, new C06058b(e10));
                    return false;
                }
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e11) {
                throw new C0681Bo(e11);
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0G(C1900k1 c1900k1, Uri uri, String str) throws ActivityNotFoundException {
        A08.get();
        return A0H(c1900k1, uri, str, null);
    }

    public static boolean A0H(C1900k1 c1900k1, Uri uri, String str, C1 c12) throws ActivityNotFoundException {
        if (c12 == null || c1900k1.A0E() == null) {
            return false;
        }
        new Bundle().putString(A07(98, 15, 52), str);
        uri.toString();
        c1900k1.A0E();
        throw new NullPointerException(A07(172, 18, 74));
    }

    public static boolean A0I(C1900k1 c1900k1, AdActivityIntent adActivityIntent) throws C0681Bo {
        Intent A012 = A01(adActivityIntent);
        try {
            Activity currentActivity = ActivityUtils.A00();
            if (currentActivity == null) {
                currentActivity = c1900k1.A0E();
            }
            if (currentActivity == null) {
                return false;
            }
            currentActivity.startActivityForResult(A012, 0);
            return true;
        } catch (ActivityNotFoundException e8) {
            throw new C0681Bo(e8);
        }
    }
}
