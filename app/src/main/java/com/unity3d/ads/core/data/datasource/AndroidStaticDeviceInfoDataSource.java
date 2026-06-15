package com.unity3d.ads.core.data.datasource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import b9.e;
import b9.o;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import i8.l;
import i8.w;
import j8.q;
import j8.y;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import r8.c;
import r8.k;
/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final Companion Companion = new Companion(null);
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT;
    private final AnalyticsDataSource analyticsDataSource;
    private final Context context;
    private final ByteStringDataSource glInfoStore;
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
    private final StoreDataSource storeDataSource;

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidStaticDeviceInfoDataSource(Context context, ByteStringDataSource glInfoStore, AnalyticsDataSource analyticsDataSource, StoreDataSource storeDataSource) {
        n.f(context, "context");
        n.f(glInfoStore, "glInfoStore");
        n.f(analyticsDataSource, "analyticsDataSource");
        n.f(storeDataSource, "storeDataSource");
        this.context = context;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        n.e(newBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setBundleId(getAppName());
        _create.setBundleVersion(getAppVersion());
        _create.setAppDebuggable(isAppDebuggable());
        _create.setRooted(isRooted());
        _create.setOsVersion(getOsVersion());
        _create.setDeviceMake(getManufacturer());
        _create.setDeviceModel(getModel());
        _create.setWebviewUa(getWebViewUserAgent());
        _create.setScreenDensity(getScreenDensity());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        _create.setScreenSize(getScreenLayout());
        _create.addAllStores(_create.getStores(), getStores$default(this, null, 1, null));
        _create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(StorageType.EXTERNAL)));
        _create.setTotalRamMemory(getTotalMemory());
        _create.setCpuModel(getCPUModel());
        _create.setCpuCount(getCPUCount());
        _create.setAndroid(fetchAndroidStaticDeviceInfo());
        this.staticDeviceInfo = _create._build();
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        n.e(newBuilder, "newBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setApiLevel(getApiLevel());
        _create.setVersionCode(getVersionCode());
        _create.setAndroidFingerprint(getFingerprint());
        _create.setAppInstaller(getInstallerPackageName());
        _create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        _create.setBuildBoard(getBoard());
        _create.setBuildBrand(getBrand());
        _create.setBuildDevice(getDevice());
        _create.setBuildDisplay(getDisplay());
        _create.setBuildFingerprint(getFingerprint());
        _create.setBuildHardware(getHardware());
        _create.setBuildHost(getHost());
        _create.setBuildBootloader(getBootloader());
        _create.setBuildProduct(getProduct());
        _create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            _create.setBuildId(buildId);
        }
        _create.setPhoneType(getPhoneType());
        _create.setSimOperator(getSimOperator());
        return _create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() {
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
            n.e(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (PackageManager.NameNotFoundException e8) {
            DeviceLog.exception("Error getting package info", e8);
            return "";
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() {
        List e8;
        Object B;
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            n.e(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            e8 = k.e(new File("/proc/cpuinfo"), null, 1, null);
            B = y.B(e8);
            return (String) B;
        } catch (FileNotFoundException e10) {
            DeviceLog.exception("Error reading CPU model", e10);
            return "";
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr != null) {
                if (!(signatureArr.length == 0)) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
                    n.d(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) generateCertificate).getEncoded()));
                    n.e(hexString, "toHexString(publicKey)");
                    return hexString;
                }
                return "";
            }
            return "";
        } catch (Exception e8) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e8);
            return "";
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                DeviceLog.error("Unhandled storagetype: " + storageType);
                return null;
            }
            return this.context.getExternalCacheDir();
        }
        return this.context.getCacheDir();
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getGPUModel(m8.d<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            i8.p.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            i8.p.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.glInfoStore
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.nio.charset.Charset r0 = b9.c.f5283b
            java.lang.String r5 = r5.toString(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel(m8.d):java.lang.Object");
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) {
        String str;
        FileNotFoundException e8;
        int i10 = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            i11 = 1;
        } else if (i10 != 2) {
            throw new l();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            str = null;
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    str = randomAccessFile.readLine();
                } catch (FileNotFoundException e10) {
                    e8 = e10;
                    DeviceLog.exception("Error reading memory info", e8);
                    return getMemoryValueFromString(str);
                }
            }
            w wVar = w.f26638a;
            c.a(randomAccessFile, null);
        } catch (FileNotFoundException e11) {
            str = null;
            e8 = e11;
        }
        return getMemoryValueFromString(str);
    }

    private final long getMemoryValueFromString(String str) {
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            String str2 = null;
            while (matcher.find()) {
                str2 = matcher.group(1);
            }
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -1L;
        }
        return 0L;
    }

    @TargetApi(21)
    private final ArrayList<String> getNewAbiList() {
        List f10;
        ArrayList<String> arrayList = new ArrayList<>();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        n.e(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        f10 = q.f(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length));
        arrayList.addAll(f10);
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String CPU_ABI = Build.CPU_ABI;
        n.e(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        String CPU_ABI2 = Build.CPU_ABI2;
        n.e(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        n.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        n.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        n.e(simOperator, "telephonyManager.simOperator");
        return simOperator;
    }

    private final List<String> getStores(List<String> list) {
        return this.storeDataSource.fetchStores(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = q.d();
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final int getVersionCode() {
        return 41302;
    }

    private final String getVersionName() {
        return "4.13.2";
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            n.e(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (Exception e8) {
            DeviceLog.exception("Exception getting webview user agent", e8);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        boolean z10;
        PackageManager packageManager = this.context.getPackageManager();
        n.e(packageManager, "context.packageManager");
        String packageName = this.context.getPackageName();
        n.e(packageName, "context.packageName");
        boolean z11 = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            n.e(applicationInfo, "pm.getApplicationInfo(pkgName, 0)");
            int i10 = applicationInfo.flags & 2;
            applicationInfo.flags = i10;
            if (i10 != 0) {
                z10 = true;
                z11 = false;
            } else {
                z11 = false;
                z10 = false;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            DeviceLog.exception("Could not find name", e8);
            z10 = false;
        }
        if (z11) {
            try {
                Signature[] signatures = packageManager.getPackageInfo(packageName, 64).signatures;
                n.e(signatures, "signatures");
                for (Signature signature : signatures) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    n.d(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    z10 = n.a(((X509Certificate) generateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (z10) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                DeviceLog.exception("Could not find name", e10);
            } catch (CertificateException e11) {
                DeviceLog.exception("Certificate exception", e11);
            }
        }
        return z10;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    @TargetApi(29)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary(BINARY_SU);
        } catch (Exception e8) {
            DeviceLog.exception("Rooted check failed", e8);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r5 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isSoftwareOnly(android.media.MediaCodecInfo r4, java.lang.String r5) {
        /*
            r3 = this;
            int r5 = r3.getApiLevel()
            r0 = 29
            if (r5 < r0) goto Ld
            boolean r4 = r3.isSoftwareOnlyV29(r4)
            return r4
        Ld:
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "codecInfo.name"
            kotlin.jvm.internal.n.e(r4, r5)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r0 = "ROOT"
            kotlin.jvm.internal.n.e(r5, r0)
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.n.e(r4, r5)
            java.lang.String r5 = "arc."
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r5 = b9.f.r(r4, r5, r0, r1, r2)
            if (r5 == 0) goto L32
            goto L7b
        L32:
            java.lang.String r5 = "omx.google."
            boolean r5 = b9.f.r(r4, r5, r0, r1, r2)
            if (r5 != 0) goto L7a
            java.lang.String r5 = "omx.ffmpeg."
            boolean r5 = b9.f.r(r4, r5, r0, r1, r2)
            if (r5 != 0) goto L7a
            java.lang.String r5 = "omx.sec."
            boolean r5 = b9.f.r(r4, r5, r0, r1, r2)
            if (r5 == 0) goto L52
            java.lang.String r5 = ".sw."
            boolean r5 = b9.f.w(r4, r5, r0, r1, r2)
            if (r5 != 0) goto L7a
        L52:
            java.lang.String r5 = "omx.qcom.video.decoder.hevcswvdec"
            boolean r5 = kotlin.jvm.internal.n.a(r4, r5)
            if (r5 != 0) goto L7a
            java.lang.String r5 = "c2.android."
            boolean r5 = b9.f.r(r4, r5, r0, r1, r2)
            if (r5 != 0) goto L7a
            java.lang.String r5 = "c2.google."
            boolean r5 = b9.f.r(r4, r5, r0, r1, r2)
            if (r5 != 0) goto L7a
            java.lang.String r5 = "omx."
            boolean r5 = b9.f.r(r4, r5, r0, r1, r2)
            if (r5 != 0) goto L7b
            java.lang.String r5 = "c2."
            boolean r4 = b9.f.r(r4, r5, r0, r1, r2)
            if (r4 != 0) goto L7b
        L7a:
            r0 = 1
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.isSoftwareOnly(android.media.MediaCodecInfo, java.lang.String):boolean");
    }

    @TargetApi(29)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    private final boolean searchPathForBinary(String str) {
        List<String> d10;
        List d11;
        String[] strArr;
        File[] listFiles;
        boolean z10;
        String str2 = System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str2 != null && (d10 = new e(":").d(str2, 0)) != null) {
            if (!d10.isEmpty()) {
                ListIterator<String> listIterator = d10.listIterator(d10.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        d11 = y.J(d10, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            d11 = q.d();
            if (d11 != null && (strArr = (String[]) d11.toArray(new String[0])) != null) {
                for (String str3 : strArr) {
                    File file = new File(str3);
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (n.a(file2.getName(), str)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        boolean l10;
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i10);
            if (!codecInfo.isEncoder()) {
                for (String str2 : codecInfo.getSupportedTypes()) {
                    l10 = o.l(str2, str, true);
                    if (l10) {
                        n.e(codecInfo, "codecInfo");
                        if (isHardwareAccelerated(codecInfo, str)) {
                            arrayList.add(codecInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetch(java.util.List<java.lang.String> r6, m8.d<? super gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource) r0
            i8.p.b(r7)
            goto L62
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            i8.p.b(r7)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r7 = r5.staticDeviceInfo
            java.lang.String r7 = r7.getGpuModel()
            if (r7 == 0) goto L4e
            int r7 = r7.length()
            if (r7 != 0) goto L4c
            goto L4e
        L4c:
            r7 = r3
            goto L4f
        L4e:
            r7 = r4
        L4f:
            if (r7 != 0) goto L54
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r5.staticDeviceInfo
            return r6
        L54:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.getGPUModel(r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r0 = r5
        L62:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L6c
            int r1 = r7.length()
            if (r1 != 0) goto L6d
        L6c:
            r3 = r4
        L6d:
            if (r3 == 0) goto L72
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r0.staticDeviceInfo
            return r6
        L72:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = r0.staticDeviceInfo
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl$Companion r2 = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion
            com.google.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
            java.lang.String r3 = "this.toBuilder()"
            kotlin.jvm.internal.n.e(r1, r3)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder r1 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) r1
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl r1 = r2._create(r1)
            r1.setGpuModel(r7)
            com.google.protobuf.kotlin.DslList r7 = r1.getStores()
            r1.clearStores(r7)
            com.google.protobuf.kotlin.DslList r7 = r1.getStores()
            java.util.List r6 = r0.getStores(r6)
            r1.addAllStores(r7, r6)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r1._build()
            r0.staticDeviceInfo = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch(java.util.List, m8.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached() {
        return this.staticDeviceInfo;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAppName() {
        String packageName = this.context.getPackageName();
        n.e(packageName, "context.packageName");
        return packageName;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getAuid(d<? super String> dVar) {
        String string = AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getIdfi(d<? super String> dVar) {
        String string = AndroidPreferences.getString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string == null) {
            String uuid = UUID.randomUUID().toString();
            AndroidPreferences.setString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
            return uuid;
        }
        return string;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        n.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        n.e(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    public final List<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(File file) {
        int b10;
        if (file == null || !file.exists()) {
            return -1L;
        }
        b10 = u8.c.b((float) (file.getTotalSpace() / 1024));
        return b10;
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H264).isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H265).isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}
