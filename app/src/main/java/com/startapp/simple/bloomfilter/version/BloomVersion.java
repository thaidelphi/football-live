package com.startapp.simple.bloomfilter.version;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BloomVersion {

    /* renamed from: a  reason: collision with root package name */
    public static final BloomVersion f23356a;

    /* renamed from: b  reason: collision with root package name */
    public static final BloomVersion f23357b;

    /* renamed from: c  reason: collision with root package name */
    public static final BloomVersion f23358c;

    /* renamed from: d  reason: collision with root package name */
    public static final BloomVersion f23359d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ BloomVersion[] f23360e;
    private final int numberOfHashes;
    private final int sizeOfBucket;
    private final String version;

    static {
        BloomVersion bloomVersion = new BloomVersion("ZERO", 0, "0", 1, 720);
        f23356a = bloomVersion;
        BloomVersion bloomVersion2 = new BloomVersion() { // from class: com.startapp.simple.bloomfilter.version.BloomVersion.1
        };
        f23357b = bloomVersion2;
        BloomVersion bloomVersion3 = new BloomVersion("FOUR", 2, "4", 3, IronSourceConstants.BN_AUCTION_REQUEST);
        f23358c = bloomVersion3;
        BloomVersion bloomVersion4 = new BloomVersion("FIVE", 3, "5", 3, 1000000);
        f23359d = bloomVersion4;
        f23360e = new BloomVersion[]{bloomVersion, bloomVersion2, bloomVersion3, bloomVersion4};
    }

    public /* synthetic */ BloomVersion() {
        this("THREE", 1, "3.0", 1, 720);
    }

    public static BloomVersion valueOf(String str) {
        return (BloomVersion) Enum.valueOf(BloomVersion.class, str);
    }

    public static BloomVersion[] values() {
        return (BloomVersion[]) f23360e.clone();
    }

    public final int a() {
        return this.numberOfHashes;
    }

    public final int b() {
        return this.sizeOfBucket;
    }

    public final String c() {
        return this.version;
    }

    public BloomVersion(String str, int i10, String str2, int i11, int i12) {
        this.version = str2;
        this.numberOfHashes = i11;
        this.sizeOfBucket = i12;
    }
}
