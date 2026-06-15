package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.cc;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlh extends y0 {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f13714g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f13715h = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f13716c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f13717d;

    /* renamed from: e  reason: collision with root package name */
    private int f13718e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f13719f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlh(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13719f = null;
        this.f13717d = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean R(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean S(String str) {
        Preconditions.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean T(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.m(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean U(Context context, boolean z10) {
        Preconditions.m(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return d0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return d0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean V(String str) {
        return !f13715h[0].equals(str);
    }

    static final boolean Y(Bundle bundle, int i10) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i10);
            return true;
        }
        return false;
    }

    @VisibleForTesting
    static final boolean Z(String str) {
        Preconditions.m(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int a0(String str) {
        if ("_ldl".equals(str)) {
            this.f13220a.u();
            return com.ironsource.mediationsdk.metadata.a.f18931n;
        } else if ("_id".equals(str)) {
            this.f13220a.u();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f13220a.u();
            return 100;
        } else {
            this.f13220a.u();
            return 36;
        }
    }

    private final Object b0(int i10, Object obj, boolean z10, boolean z11) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (z11 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle p02 = p0((Bundle) parcelable);
                            if (!p02.isEmpty()) {
                                arrayList.add(p02);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return null;
            }
            return m(obj.toString(), i10, z10);
        }
    }

    private static boolean c0(String str, String[] strArr) {
        Preconditions.m(strArr);
        for (String str2 : strArr) {
            if (zzlf.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public static long l0(byte[] bArr) {
        Preconditions.m(bArr);
        int length = bArr.length;
        int i10 = 0;
        Preconditions.p(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest o() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList q(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.f13273a);
            bundle.putString(cc.f16874p, zzacVar.f13274b);
            bundle.putLong("creation_timestamp", zzacVar.f13276d);
            bundle.putString("name", zzacVar.f13275c.f13708b);
            zzgu.b(bundle, Preconditions.m(zzacVar.f13275c.X()));
            bundle.putBoolean("active", zzacVar.f13277e);
            String str = zzacVar.f13278f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.f13279g;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.f13312a);
                zzau zzauVar = zzawVar.f13313b;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.n0());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.f13280h);
            zzaw zzawVar2 = zzacVar.f13281i;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.f13312a);
                zzau zzauVar2 = zzawVar2.f13313b;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.n0());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.f13275c.f13709c);
            bundle.putLong("time_to_live", zzacVar.f13282j);
            zzaw zzawVar3 = zzacVar.f13283k;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.f13312a);
                zzau zzauVar3 = zzawVar3.f13313b;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.n0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void t(zzik zzikVar, Bundle bundle, boolean z10) {
        if (bundle != null && zzikVar != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = zzikVar.f13632a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzikVar.f13633b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzikVar.f13634c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && zzikVar == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f13220a.zzay().r().b("Error returning bundle value to wrapper", e8);
        }
    }

    public final void B(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f13220a.zzay().r().b("Error returning byte array to wrapper", e8);
        }
    }

    public final void C(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i10);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f13220a.zzay().r().b("Error returning int value to wrapper", e8);
        }
    }

    public final void D(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j10);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f13220a.zzay().r().b("Error returning long value to wrapper", e8);
        }
    }

    public final void E(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f13220a.zzay().r().b("Error returning string value to wrapper", e8);
        }
    }

    final void F(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        String str4;
        int J;
        if (bundle == null) {
            return;
        }
        this.f13220a.u();
        int i11 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int h02 = !z10 ? h0(str5) : 0;
                if (h02 == 0) {
                    h02 = g0(str5);
                }
                i10 = h02;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                s(bundle, i10, str5, str5, i10 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (P(bundle.get(str5))) {
                    this.f13220a.zzay().s().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    J = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    J = J(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (J != 0 && !"_ev".equals(str4)) {
                    s(bundle, J, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (S(str4) && !c0(str4, zzgw.f13592d) && (i11 = i11 + 1) > 0) {
                    this.f13220a.zzay().n().c("Item cannot contain custom parameters", this.f13220a.y().d(str2), this.f13220a.y().b(bundle));
                    Y(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (Z(str)) {
                return true;
            }
            if (this.f13220a.l()) {
                this.f13220a.zzay().n().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeo.u(str));
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            if (Z(str2)) {
                return true;
            }
            this.f13220a.zzay().n().b("Invalid admob_app_id. Analytics disabled.", zzeo.u(str2));
            return false;
        } else {
            if (this.f13220a.l()) {
                this.f13220a.zzay().n().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H(String str, int i10, String str2) {
        if (str2 == null) {
            this.f13220a.zzay().n().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i10) {
            this.f13220a.zzay().n().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f13220a.zzay().n().b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.m(str2);
        String[] strArr3 = f13714g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f13220a.zzay().n().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !c0(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !c0(str2, strArr2)) {
            this.f13220a.zzay().n().c("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int J(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.J(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f13220a.zzay().s().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L(String str, String str2) {
        if (str2 == null) {
            this.f13220a.zzay().n().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f13220a.zzay().n().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.f13220a.zzay().n().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f13220a.zzay().n().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str, String str2) {
        if (str2 == null) {
            this.f13220a.zzay().n().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f13220a.zzay().n().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f13220a.zzay().n().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f13220a.zzay().n().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str) {
        c();
        if (Wrappers.a(this.f13220a.zzau()).a(str) == 0) {
            return true;
        }
        this.f13220a.zzay().l().b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean O(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String p10 = this.f13220a.u().p();
        this.f13220a.zzaw();
        return p10.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean Q(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f10 = Wrappers.a(context).f(str, 64);
            if (f10 == null || (signatureArr = f10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e8) {
            this.f13220a.zzay().m().b("Package name not found", e8);
            return true;
        } catch (CertificateException e10) {
            this.f13220a.zzay().m().b("Error obtaining certificate", e10);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean W(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.m(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] X(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.y0
    protected final void d() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f13220a.zzay().r().a("Utils falling back to Random for random id");
            }
        }
        this.f13717d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.y0
    protected final boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e0(String str, Object obj) {
        boolean K;
        if ("_ldl".equals(str)) {
            K = K("user property referrer", str, a0(str), obj);
        } else {
            K = K("user property", str, a0(str), obj);
        }
        return K ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f0(String str) {
        if (L("event", str)) {
            if (I("event", zzgv.f13585a, zzgv.f13586b, str)) {
                this.f13220a.u();
                return !H("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    final int g0(String str) {
        if (L("event param", str)) {
            if (I("event param", null, null, str)) {
                this.f13220a.u();
                return !H("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    final int h0(String str) {
        if (M("event param", str)) {
            if (I("event param", null, null, str)) {
                this.f13220a.u();
                return !H("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i0(String str) {
        if (L("user property", str)) {
            if (I("user property", zzgx.f13593a, null, str)) {
                this.f13220a.u();
                return !H("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object j(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f13220a.u();
            return b0(256, obj, true, true);
        }
        if (R(str)) {
            this.f13220a.u();
        } else {
            this.f13220a.u();
            i10 = 100;
        }
        return b0(i10, obj, false, true);
    }

    public final int j0() {
        if (this.f13719f == null) {
            this.f13719f = Integer.valueOf(GoogleApiAvailabilityLight.h().b(this.f13220a.zzau()) / 1000);
        }
        return this.f13719f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object k(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return b0(a0(str), obj, true, false);
        }
        return b0(a0(str), obj, false, false);
    }

    public final int k0(int i10) {
        return GoogleApiAvailabilityLight.h().j(this.f13220a.zzau(), GooglePlayServicesUtilLight.f12026a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String l() {
        byte[] bArr = new byte[16];
        p().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String m(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i10) {
            if (z10) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
            }
            return null;
        }
        return str;
    }

    public final long m0() {
        long andIncrement;
        long j10;
        if (this.f13717d.get() == 0) {
            synchronized (this.f13717d) {
                long nextLong = new Random(System.nanoTime() ^ this.f13220a.zzav().a()).nextLong();
                int i10 = this.f13718e + 1;
                this.f13718e = i10;
                j10 = nextLong + i10;
            }
            return j10;
        }
        synchronized (this.f13717d) {
            this.f13717d.compareAndSet(-1L, 1L);
            andIncrement = this.f13717d.getAndIncrement();
        }
        return andIncrement;
    }

    public final URL n(long j10, String str, String str2, long j11) {
        try {
            Preconditions.g(str2);
            Preconditions.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 73000L, Integer.valueOf(j0())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f13220a.u().q())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e8) {
            this.f13220a.zzay().m().b("Failed to create BOW URL for Deferred Deep Link. exception", e8.getMessage());
            return null;
        }
    }

    public final long n0(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle o0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("campaign_id", str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e8) {
                this.f13220a.zzay().r().b("Install referrer url isn't a hierarchical URI", e8);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom p() {
        c();
        if (this.f13716c == null) {
            this.f13716c = new SecureRandom();
        }
        return this.f13716c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle p0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object j10 = j(str, bundle.get(str));
                if (j10 == null) {
                    this.f13220a.zzay().s().b("Param value can't be null", this.f13220a.y().e(str));
                } else {
                    x(bundle2, str, j10);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle q0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.q0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f13220a.zzay().r().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaw r0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (f0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle q02 = q0(str, str2, bundle3, CollectionUtils.a("_o"), true);
            if (z10) {
                q02 = p0(q02);
            }
            Preconditions.m(q02);
            return new zzaw(str2, new zzau(q02), str3, j10);
        }
        this.f13220a.zzay().m().b("Invalid conditional property event name", this.f13220a.y().f(str2));
        throw new IllegalArgumentException();
    }

    final void s(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (Y(bundle, i10)) {
            this.f13220a.u();
            bundle.putString("_ev", m(str, 40, true));
            if (obj != null) {
                Preconditions.m(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f13220a.I().x(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(zzep zzepVar, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(zzepVar.f13496d.keySet())) {
            if (S(str) && (i11 = i11 + 1) > i10) {
                this.f13220a.zzay().n().c("Event can't contain more than " + i10 + " params", this.f13220a.y().d(zzepVar.f13493a), this.f13220a.y().b(zzepVar.f13496d));
                Y(zzepVar.f13496d, 5);
                zzepVar.f13496d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(c4 c4Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        Y(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        c4Var.a(str, "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f13220a.zzay().s().c("Not putting event parameter. Invalid value type. name, type", this.f13220a.y().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void y(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z10);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f13220a.zzay().r().b("Error returning boolean value to wrapper", e8);
        }
    }

    public final void z(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f13220a.zzay().r().b("Error returning bundle list to wrapper", e8);
        }
    }
}
