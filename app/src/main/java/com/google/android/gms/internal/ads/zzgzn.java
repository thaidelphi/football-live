package com.google.android.gms.internal.ads;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgzn {
    public static final zzgzn zza;
    public static final zzgzn zzb;
    public static final zzgzn zzc;
    public static final zzgzn zzd;
    public static final zzgzn zze;
    public static final zzgzn zzf;
    public static final zzgzn zzg;
    public static final zzgzn zzh;
    public static final zzgzn zzi;
    public static final zzgzn zzj;
    public static final zzgzn zzk;
    public static final zzgzn zzl;
    public static final zzgzn zzm;
    public static final zzgzn zzn;
    public static final zzgzn zzo;
    public static final zzgzn zzp;
    public static final zzgzn zzq;
    public static final zzgzn zzr;
    private static final /* synthetic */ zzgzn[] zzs;
    private final zzgzo zzt;

    static {
        zzgzn zzgznVar = new zzgzn("DOUBLE", 0, zzgzo.DOUBLE, 1);
        zza = zzgznVar;
        zzgzn zzgznVar2 = new zzgzn("FLOAT", 1, zzgzo.FLOAT, 5);
        zzb = zzgznVar2;
        zzgzo zzgzoVar = zzgzo.LONG;
        zzgzn zzgznVar3 = new zzgzn("INT64", 2, zzgzoVar, 0);
        zzc = zzgznVar3;
        zzgzn zzgznVar4 = new zzgzn("UINT64", 3, zzgzoVar, 0);
        zzd = zzgznVar4;
        zzgzo zzgzoVar2 = zzgzo.INT;
        zzgzn zzgznVar5 = new zzgzn("INT32", 4, zzgzoVar2, 0);
        zze = zzgznVar5;
        zzgzn zzgznVar6 = new zzgzn("FIXED64", 5, zzgzoVar, 1);
        zzf = zzgznVar6;
        zzgzn zzgznVar7 = new zzgzn("FIXED32", 6, zzgzoVar2, 5);
        zzg = zzgznVar7;
        zzgzn zzgznVar8 = new zzgzn("BOOL", 7, zzgzo.BOOLEAN, 0);
        zzh = zzgznVar8;
        zzgzn zzgznVar9 = new zzgzn("STRING", 8, zzgzo.STRING, 2);
        zzi = zzgznVar9;
        zzgzo zzgzoVar3 = zzgzo.MESSAGE;
        zzgzn zzgznVar10 = new zzgzn("GROUP", 9, zzgzoVar3, 3);
        zzj = zzgznVar10;
        zzgzn zzgznVar11 = new zzgzn("MESSAGE", 10, zzgzoVar3, 2);
        zzk = zzgznVar11;
        zzgzn zzgznVar12 = new zzgzn("BYTES", 11, zzgzo.BYTE_STRING, 2);
        zzl = zzgznVar12;
        zzgzn zzgznVar13 = new zzgzn("UINT32", 12, zzgzoVar2, 0);
        zzm = zzgznVar13;
        zzgzn zzgznVar14 = new zzgzn("ENUM", 13, zzgzo.ENUM, 0);
        zzn = zzgznVar14;
        zzgzn zzgznVar15 = new zzgzn("SFIXED32", 14, zzgzoVar2, 5);
        zzo = zzgznVar15;
        zzgzn zzgznVar16 = new zzgzn("SFIXED64", 15, zzgzoVar, 1);
        zzp = zzgznVar16;
        zzgzn zzgznVar17 = new zzgzn("SINT32", 16, zzgzoVar2, 0);
        zzq = zzgznVar17;
        zzgzn zzgznVar18 = new zzgzn("SINT64", 17, zzgzoVar, 0);
        zzr = zzgznVar18;
        zzs = new zzgzn[]{zzgznVar, zzgznVar2, zzgznVar3, zzgznVar4, zzgznVar5, zzgznVar6, zzgznVar7, zzgznVar8, zzgznVar9, zzgznVar10, zzgznVar11, zzgznVar12, zzgznVar13, zzgznVar14, zzgznVar15, zzgznVar16, zzgznVar17, zzgznVar18};
    }

    private zzgzn(String str, int i10, zzgzo zzgzoVar, int i11) {
        this.zzt = zzgzoVar;
    }

    public static zzgzn[] values() {
        return (zzgzn[]) zzs.clone();
    }

    public final zzgzo zza() {
        return this.zzt;
    }
}
