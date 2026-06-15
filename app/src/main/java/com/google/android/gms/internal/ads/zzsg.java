package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzsg extends zzhi {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private int zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private boolean zzZ;
    protected zzhj zza;
    private boolean zzaa;
    private boolean zzab;
    private zzse zzac;
    private long zzad;
    private boolean zzae;
    private zzqz zzaf;
    private zzqz zzag;
    private final zzru zzc;
    private final zzsi zzd;
    private final float zze;
    private final zzha zzf;
    private final zzha zzg;
    private final zzha zzh;
    private final zzrn zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqm zzl;
    private zzz zzm;
    private zzz zzn;
    private zzkz zzo;
    private MediaCrypto zzp;
    private float zzq;
    private float zzr;
    private zzrw zzs;
    private zzz zzt;
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;
    private ArrayDeque zzx;
    private zzsc zzy;
    private zzrz zzz;

    public zzsg(int i10, zzru zzruVar, zzsi zzsiVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzruVar;
        this.zzd = zzsiVar;
        this.zze = f10;
        this.zzf = new zzha(0, 0);
        this.zzg = new zzha(0, 0);
        this.zzh = new zzha(2, 0);
        zzrn zzrnVar = new zzrn();
        this.zzi = zzrnVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzr = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzac = zzse.zza;
        zzrnVar.zzj(0);
        zzrnVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqm();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzR = 0;
        this.zzI = -1;
        this.zzJ = -1;
        this.zzH = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzG = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zza = new zzhj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzaQ(zzz zzzVar) {
        return zzzVar.zzL == 0;
    }

    private final void zzaR() {
        this.zzJ = -1;
        this.zzK = null;
    }

    private final void zzaS(zzse zzseVar) {
        this.zzac = zzseVar;
        if (zzseVar.zzd != -9223372036854775807L) {
            this.zzae = true;
        }
    }

    private final void zzaT() throws zzhs {
        zzqz zzqzVar = this.zzag;
        Objects.requireNonNull(zzqzVar);
        this.zzaf = zzqzVar;
        this.zzS = 0;
        this.zzT = 0;
    }

    @TargetApi(23)
    private final boolean zzaU() throws zzhs {
        if (this.zzU) {
            this.zzS = 1;
            if (this.zzC) {
                this.zzT = 3;
                return false;
            }
            this.zzT = 2;
        } else {
            zzaT();
        }
        return true;
    }

    private final boolean zzaV() {
        return this.zzJ >= 0;
    }

    private final boolean zzaW(long j10, long j11) {
        if (j11 < j10) {
            zzz zzzVar = this.zzn;
            if (zzzVar == null || !Objects.equals(zzzVar.zzo, "audio/opus")) {
                return true;
            }
            return !zzade.zzf(j10, j11);
        }
        return false;
    }

    private final boolean zzaX(int i10) throws zzhs {
        zzha zzhaVar = this.zzf;
        zzjv zzk = zzk();
        zzhaVar.zzb();
        int zzcU = zzcU(zzk, this.zzf, i10 | 4);
        if (zzcU == -5) {
            zzac(zzk);
            return true;
        } else if (zzcU == -4 && this.zzf.zzf()) {
            this.zzZ = true;
            zzai();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaY(zzz zzzVar) throws zzhs {
        int i10 = zzeh.zza;
        if (this.zzs != null && this.zzT != 3 && zzcT() != 0) {
            float f10 = this.zzr;
            Objects.requireNonNull(zzzVar);
            float zzZ = zzZ(f10, zzzVar, zzT());
            float f11 = this.zzw;
            if (f11 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                } else if (f11 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zzrw zzrwVar = this.zzs;
                    Objects.requireNonNull(zzrwVar);
                    zzrwVar.zzq(bundle);
                    this.zzw = zzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzP = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzO = false;
        this.zzN = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzhs {
        if (this.zzU) {
            this.zzS = 1;
            this.zzT = 3;
            return;
        }
        zzaG();
        zzaC();
    }

    private final void zzah() {
        try {
            zzrw zzrwVar = this.zzs;
            zzcv.zzb(zzrwVar);
            zzrwVar.zzj();
        } finally {
            zzaH();
        }
    }

    @TargetApi(23)
    private final void zzai() throws zzhs {
        int i10 = this.zzT;
        if (i10 == 1) {
            zzah();
        } else if (i10 == 2) {
            zzah();
            zzaT();
        } else if (i10 != 3) {
            this.zzaa = true;
            zzaq();
        } else {
            zzaG();
            zzaC();
        }
    }

    private final void zzao() {
        this.zzI = -1;
        this.zzg.zzc = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhi
    public void zzC() {
        try {
            zzad();
            zzaG();
        } finally {
            this.zzag = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzF(com.google.android.gms.internal.ads.zzz[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzty r18) throws com.google.android.gms.internal.ads.zzhs {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzse r1 = r0.zzac
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zzse r1 = new com.google.android.gms.internal.ads.zzse
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaS(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzX
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzad
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zzse r1 = new com.google.android.gms.internal.ads.zzse
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaS(r1)
            com.google.android.gms.internal.ads.zzse r1 = r0.zzac
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzap()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzse r9 = new com.google.android.gms.internal.ads.zzse
            long r3 = r0.zzX
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsg.zzF(com.google.android.gms.internal.ads.zzz[], long, long, com.google.android.gms.internal.ads.zzty):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzla
    public void zzM(float f10, float f11) throws zzhs {
        this.zzq = f10;
        this.zzr = f11;
        zzaY(this.zzt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x029d, code lost:
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x033b, code lost:
        if (r15.zzn != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03ef, code lost:
        if (r1.zzF != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03f1, code lost:
        r1.zzV = true;
        r4.zzk(r1.zzI, 0, 0, 0, 4);
        zzao();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0400, code lost:
        r1.zzS = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0402, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r15.zzaa = true;
        r13 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x061d  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.google.android.gms.internal.ads.zzla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzV(long r24, long r26) throws com.google.android.gms.internal.ads.zzhs {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsg.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public boolean zzW() {
        return this.zzaa;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public boolean zzX() {
        if (this.zzm != null) {
            if (zzS() || zzaV()) {
                return true;
            }
            if (this.zzH != -9223372036854775807L && zzi().zzb() < this.zzH) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final int zzY(zzz zzzVar) throws zzhs {
        try {
            return zzaa(this.zzd, zzzVar);
        } catch (zzsn e8) {
            throw zzcW(e8, zzzVar, false, IronSourceConstants.NT_INSTANCE_LOAD);
        }
    }

    protected float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        throw null;
    }

    protected zzry zzaA(Throwable th, zzrz zzrzVar) {
        return new zzry(th, zzrzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzrz zzaB() {
        return this.zzz;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(29:(12:43|44|45|46|(1:48)|49|(2:51|(1:53))|54|55|56|(41:158|159|(1:161)|162|163|(2:165|166)|170|171|(1:173)|174|(4:176|177|(6:178|179|180|181|182|(5:184|(2:209|210)(2:186|(1:188)(2:192|(1:194)(2:195|(1:197)(2:198|(1:200)(6:201|202|203|204|205|191)))))|189|190|191)(1:214))|215)(1:361)|216|(1:220)|221|(5:229|230|231|232|233)|237|(1:243)|244|(1:246)|247|(1:249)|250|(1:252)|253|(1:255)|256|(1:258)|259|260|(1:262)|263|(5:265|(1:267)|268|(1:270)|271)|272|(33:274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322)|323|(3:325|(2:327|(2:329|(2:331|(2:333|(1:335)(3:337|338|340))(1:341))(1:342))(1:343))(1:344)|336)|345|346|347|348|349)(1:58)|59)|(2:63|(22:71|72|(1:141)(1:76)|77|(1:140)(1:81)|82|(16:84|(1:86)|87|88|89|90|(1:92)|93|94|95|96|97|98|99|101|102)|(14:139|88|89|90|(0)|93|94|95|96|97|98|99|101|102)|87|88|89|90|(0)|93|94|95|96|97|98|99|101|102))|142|(2:148|(25:156|72|(1:74)|141|77|(1:79)|140|82|(0)|(6:120|122|124|126|128|130)|132|139|88|89|90|(0)|93|94|95|96|97|98|99|101|102))|157|72|(0)|141|77|(0)|140|82|(0)|(0)|132|139|88|89|90|(0)|93|94|95|96|97|98|99|101|102) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:43|44|45|46|(1:48)|49|(2:51|(1:53))|54|55|56|(41:158|159|(1:161)|162|163|(2:165|166)|170|171|(1:173)|174|(4:176|177|(6:178|179|180|181|182|(5:184|(2:209|210)(2:186|(1:188)(2:192|(1:194)(2:195|(1:197)(2:198|(1:200)(6:201|202|203|204|205|191)))))|189|190|191)(1:214))|215)(1:361)|216|(1:220)|221|(5:229|230|231|232|233)|237|(1:243)|244|(1:246)|247|(1:249)|250|(1:252)|253|(1:255)|256|(1:258)|259|260|(1:262)|263|(5:265|(1:267)|268|(1:270)|271)|272|(33:274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322)|323|(3:325|(2:327|(2:329|(2:331|(2:333|(1:335)(3:337|338|340))(1:341))(1:342))(1:343))(1:344)|336)|345|346|347|348|349)(1:58)|59|(2:63|(22:71|72|(1:141)(1:76)|77|(1:140)(1:81)|82|(16:84|(1:86)|87|88|89|90|(1:92)|93|94|95|96|97|98|99|101|102)|(14:139|88|89|90|(0)|93|94|95|96|97|98|99|101|102)|87|88|89|90|(0)|93|94|95|96|97|98|99|101|102))|142|(2:148|(25:156|72|(1:74)|141|77|(1:79)|140|82|(0)|(6:120|122|124|126|128|130)|132|139|88|89|90|(0)|93|94|95|96|97|98|99|101|102))|157|72|(0)|141|77|(0)|140|82|(0)|(0)|132|139|88|89|90|(0)|93|94|95|96|97|98|99|101|102) */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0584, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0585, code lost:
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0597, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04d5 A[Catch: Exception -> 0x0586, TryCatch #12 {Exception -> 0x0586, blocks: (B:110:0x020e, B:109:0x01fa, B:111:0x0216, B:117:0x0232, B:119:0x0237, B:121:0x023b, B:122:0x024f, B:126:0x026d, B:128:0x0273, B:130:0x0279, B:133:0x0283, B:136:0x029a, B:138:0x029e, B:140:0x02a4, B:142:0x02aa, B:143:0x02b8, B:145:0x02c0, B:146:0x02ca, B:148:0x02cf, B:149:0x02d9, B:151:0x02de, B:152:0x02e8, B:154:0x02ed, B:155:0x02f7, B:157:0x02fb, B:158:0x0305, B:161:0x030f, B:162:0x0325, B:164:0x0329, B:166:0x0339, B:167:0x033e, B:169:0x0342, B:170:0x0347, B:171:0x034d, B:173:0x0354, B:175:0x0364, B:176:0x0369, B:178:0x036d, B:179:0x0372, B:181:0x0376, B:182:0x037b, B:184:0x037f, B:185:0x0384, B:187:0x0388, B:188:0x038d, B:190:0x0391, B:191:0x0396, B:193:0x039a, B:194:0x039f, B:196:0x03a3, B:197:0x03a8, B:199:0x03ac, B:200:0x03b1, B:202:0x03b5, B:203:0x03ba, B:205:0x03be, B:206:0x03c3, B:208:0x03c7, B:209:0x03cc, B:211:0x03d0, B:212:0x03d5, B:214:0x03d9, B:215:0x03de, B:217:0x03e2, B:218:0x03e7, B:220:0x03ea, B:221:0x03ef, B:222:0x03f5, B:224:0x03fa, B:241:0x0425, B:235:0x0412, B:236:0x0419, B:242:0x0428, B:245:0x0432, B:255:0x045d, B:257:0x046a, B:259:0x0472, B:261:0x047c, B:263:0x0484, B:265:0x048c, B:284:0x04cf, B:286:0x04d5, B:290:0x04e0, B:292:0x04e6, B:296:0x04f1, B:298:0x04f7, B:323:0x054e, B:325:0x0555, B:327:0x055c, B:328:0x0569, B:303:0x0504, B:305:0x050c, B:307:0x0514, B:309:0x051c, B:311:0x0524, B:313:0x052c, B:315:0x0534, B:317:0x053e, B:319:0x0548, B:270:0x049a, B:272:0x04a2, B:274:0x04aa, B:276:0x04b4, B:278:0x04bc, B:280:0x04c4), top: B:386:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04e6 A[Catch: Exception -> 0x0586, TryCatch #12 {Exception -> 0x0586, blocks: (B:110:0x020e, B:109:0x01fa, B:111:0x0216, B:117:0x0232, B:119:0x0237, B:121:0x023b, B:122:0x024f, B:126:0x026d, B:128:0x0273, B:130:0x0279, B:133:0x0283, B:136:0x029a, B:138:0x029e, B:140:0x02a4, B:142:0x02aa, B:143:0x02b8, B:145:0x02c0, B:146:0x02ca, B:148:0x02cf, B:149:0x02d9, B:151:0x02de, B:152:0x02e8, B:154:0x02ed, B:155:0x02f7, B:157:0x02fb, B:158:0x0305, B:161:0x030f, B:162:0x0325, B:164:0x0329, B:166:0x0339, B:167:0x033e, B:169:0x0342, B:170:0x0347, B:171:0x034d, B:173:0x0354, B:175:0x0364, B:176:0x0369, B:178:0x036d, B:179:0x0372, B:181:0x0376, B:182:0x037b, B:184:0x037f, B:185:0x0384, B:187:0x0388, B:188:0x038d, B:190:0x0391, B:191:0x0396, B:193:0x039a, B:194:0x039f, B:196:0x03a3, B:197:0x03a8, B:199:0x03ac, B:200:0x03b1, B:202:0x03b5, B:203:0x03ba, B:205:0x03be, B:206:0x03c3, B:208:0x03c7, B:209:0x03cc, B:211:0x03d0, B:212:0x03d5, B:214:0x03d9, B:215:0x03de, B:217:0x03e2, B:218:0x03e7, B:220:0x03ea, B:221:0x03ef, B:222:0x03f5, B:224:0x03fa, B:241:0x0425, B:235:0x0412, B:236:0x0419, B:242:0x0428, B:245:0x0432, B:255:0x045d, B:257:0x046a, B:259:0x0472, B:261:0x047c, B:263:0x0484, B:265:0x048c, B:284:0x04cf, B:286:0x04d5, B:290:0x04e0, B:292:0x04e6, B:296:0x04f1, B:298:0x04f7, B:323:0x054e, B:325:0x0555, B:327:0x055c, B:328:0x0569, B:303:0x0504, B:305:0x050c, B:307:0x0514, B:309:0x051c, B:311:0x0524, B:313:0x052c, B:315:0x0534, B:317:0x053e, B:319:0x0548, B:270:0x049a, B:272:0x04a2, B:274:0x04aa, B:276:0x04b4, B:278:0x04bc, B:280:0x04c4), top: B:386:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f7 A[Catch: Exception -> 0x0586, TryCatch #12 {Exception -> 0x0586, blocks: (B:110:0x020e, B:109:0x01fa, B:111:0x0216, B:117:0x0232, B:119:0x0237, B:121:0x023b, B:122:0x024f, B:126:0x026d, B:128:0x0273, B:130:0x0279, B:133:0x0283, B:136:0x029a, B:138:0x029e, B:140:0x02a4, B:142:0x02aa, B:143:0x02b8, B:145:0x02c0, B:146:0x02ca, B:148:0x02cf, B:149:0x02d9, B:151:0x02de, B:152:0x02e8, B:154:0x02ed, B:155:0x02f7, B:157:0x02fb, B:158:0x0305, B:161:0x030f, B:162:0x0325, B:164:0x0329, B:166:0x0339, B:167:0x033e, B:169:0x0342, B:170:0x0347, B:171:0x034d, B:173:0x0354, B:175:0x0364, B:176:0x0369, B:178:0x036d, B:179:0x0372, B:181:0x0376, B:182:0x037b, B:184:0x037f, B:185:0x0384, B:187:0x0388, B:188:0x038d, B:190:0x0391, B:191:0x0396, B:193:0x039a, B:194:0x039f, B:196:0x03a3, B:197:0x03a8, B:199:0x03ac, B:200:0x03b1, B:202:0x03b5, B:203:0x03ba, B:205:0x03be, B:206:0x03c3, B:208:0x03c7, B:209:0x03cc, B:211:0x03d0, B:212:0x03d5, B:214:0x03d9, B:215:0x03de, B:217:0x03e2, B:218:0x03e7, B:220:0x03ea, B:221:0x03ef, B:222:0x03f5, B:224:0x03fa, B:241:0x0425, B:235:0x0412, B:236:0x0419, B:242:0x0428, B:245:0x0432, B:255:0x045d, B:257:0x046a, B:259:0x0472, B:261:0x047c, B:263:0x0484, B:265:0x048c, B:284:0x04cf, B:286:0x04d5, B:290:0x04e0, B:292:0x04e6, B:296:0x04f1, B:298:0x04f7, B:323:0x054e, B:325:0x0555, B:327:0x055c, B:328:0x0569, B:303:0x0504, B:305:0x050c, B:307:0x0514, B:309:0x051c, B:311:0x0524, B:313:0x052c, B:315:0x0534, B:317:0x053e, B:319:0x0548, B:270:0x049a, B:272:0x04a2, B:274:0x04aa, B:276:0x04b4, B:278:0x04bc, B:280:0x04c4), top: B:386:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0504 A[Catch: Exception -> 0x0586, TryCatch #12 {Exception -> 0x0586, blocks: (B:110:0x020e, B:109:0x01fa, B:111:0x0216, B:117:0x0232, B:119:0x0237, B:121:0x023b, B:122:0x024f, B:126:0x026d, B:128:0x0273, B:130:0x0279, B:133:0x0283, B:136:0x029a, B:138:0x029e, B:140:0x02a4, B:142:0x02aa, B:143:0x02b8, B:145:0x02c0, B:146:0x02ca, B:148:0x02cf, B:149:0x02d9, B:151:0x02de, B:152:0x02e8, B:154:0x02ed, B:155:0x02f7, B:157:0x02fb, B:158:0x0305, B:161:0x030f, B:162:0x0325, B:164:0x0329, B:166:0x0339, B:167:0x033e, B:169:0x0342, B:170:0x0347, B:171:0x034d, B:173:0x0354, B:175:0x0364, B:176:0x0369, B:178:0x036d, B:179:0x0372, B:181:0x0376, B:182:0x037b, B:184:0x037f, B:185:0x0384, B:187:0x0388, B:188:0x038d, B:190:0x0391, B:191:0x0396, B:193:0x039a, B:194:0x039f, B:196:0x03a3, B:197:0x03a8, B:199:0x03ac, B:200:0x03b1, B:202:0x03b5, B:203:0x03ba, B:205:0x03be, B:206:0x03c3, B:208:0x03c7, B:209:0x03cc, B:211:0x03d0, B:212:0x03d5, B:214:0x03d9, B:215:0x03de, B:217:0x03e2, B:218:0x03e7, B:220:0x03ea, B:221:0x03ef, B:222:0x03f5, B:224:0x03fa, B:241:0x0425, B:235:0x0412, B:236:0x0419, B:242:0x0428, B:245:0x0432, B:255:0x045d, B:257:0x046a, B:259:0x0472, B:261:0x047c, B:263:0x0484, B:265:0x048c, B:284:0x04cf, B:286:0x04d5, B:290:0x04e0, B:292:0x04e6, B:296:0x04f1, B:298:0x04f7, B:323:0x054e, B:325:0x0555, B:327:0x055c, B:328:0x0569, B:303:0x0504, B:305:0x050c, B:307:0x0514, B:309:0x051c, B:311:0x0524, B:313:0x052c, B:315:0x0534, B:317:0x053e, B:319:0x0548, B:270:0x049a, B:272:0x04a2, B:274:0x04aa, B:276:0x04b4, B:278:0x04bc, B:280:0x04c4), top: B:386:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x055c A[Catch: Exception -> 0x0586, TryCatch #12 {Exception -> 0x0586, blocks: (B:110:0x020e, B:109:0x01fa, B:111:0x0216, B:117:0x0232, B:119:0x0237, B:121:0x023b, B:122:0x024f, B:126:0x026d, B:128:0x0273, B:130:0x0279, B:133:0x0283, B:136:0x029a, B:138:0x029e, B:140:0x02a4, B:142:0x02aa, B:143:0x02b8, B:145:0x02c0, B:146:0x02ca, B:148:0x02cf, B:149:0x02d9, B:151:0x02de, B:152:0x02e8, B:154:0x02ed, B:155:0x02f7, B:157:0x02fb, B:158:0x0305, B:161:0x030f, B:162:0x0325, B:164:0x0329, B:166:0x0339, B:167:0x033e, B:169:0x0342, B:170:0x0347, B:171:0x034d, B:173:0x0354, B:175:0x0364, B:176:0x0369, B:178:0x036d, B:179:0x0372, B:181:0x0376, B:182:0x037b, B:184:0x037f, B:185:0x0384, B:187:0x0388, B:188:0x038d, B:190:0x0391, B:191:0x0396, B:193:0x039a, B:194:0x039f, B:196:0x03a3, B:197:0x03a8, B:199:0x03ac, B:200:0x03b1, B:202:0x03b5, B:203:0x03ba, B:205:0x03be, B:206:0x03c3, B:208:0x03c7, B:209:0x03cc, B:211:0x03d0, B:212:0x03d5, B:214:0x03d9, B:215:0x03de, B:217:0x03e2, B:218:0x03e7, B:220:0x03ea, B:221:0x03ef, B:222:0x03f5, B:224:0x03fa, B:241:0x0425, B:235:0x0412, B:236:0x0419, B:242:0x0428, B:245:0x0432, B:255:0x045d, B:257:0x046a, B:259:0x0472, B:261:0x047c, B:263:0x0484, B:265:0x048c, B:284:0x04cf, B:286:0x04d5, B:290:0x04e0, B:292:0x04e6, B:296:0x04f1, B:298:0x04f7, B:323:0x054e, B:325:0x0555, B:327:0x055c, B:328:0x0569, B:303:0x0504, B:305:0x050c, B:307:0x0514, B:309:0x051c, B:311:0x0524, B:313:0x052c, B:315:0x0534, B:317:0x053e, B:319:0x0548, B:270:0x049a, B:272:0x04a2, B:274:0x04aa, B:276:0x04b4, B:278:0x04bc, B:280:0x04c4), top: B:386:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05bf A[Catch: zzsc -> 0x05ef, TryCatch #16 {zzsc -> 0x05ef, blocks: (B:346:0x05a2, B:348:0x05bf, B:350:0x05c8, B:354:0x05d8, B:355:0x05da, B:349:0x05c2, B:356:0x05db, B:358:0x05e1, B:359:0x05ee), top: B:394:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05c2 A[Catch: zzsc -> 0x05ef, TryCatch #16 {zzsc -> 0x05ef, blocks: (B:346:0x05a2, B:348:0x05bf, B:350:0x05c8, B:354:0x05d8, B:355:0x05da, B:349:0x05c2, B:356:0x05db, B:358:0x05e1, B:359:0x05ee), top: B:394:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzsf] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzaC() throws com.google.android.gms.internal.ads.zzhs {
        /*
            Method dump skipped, instructions count: 1535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsg.zzaC():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzaD(long j10) {
        this.zzad = j10;
        while (!this.zzk.isEmpty() && j10 >= ((zzse) this.zzk.peek()).zzb) {
            zzse zzseVar = (zzse) this.zzk.poll();
            Objects.requireNonNull(zzseVar);
            zzaS(zzseVar);
            zzap();
        }
    }

    protected void zzaE(zzha zzhaVar) throws zzhs {
    }

    protected void zzaF(zzkz zzkzVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzqz, com.google.android.gms.internal.ads.zzrw, android.media.MediaCrypto] */
    public final void zzaG() {
        try {
            zzrw zzrwVar = this.zzs;
            if (zzrwVar != null) {
                zzrwVar.zzm();
                this.zza.zzb++;
                zzrz zzrzVar = this.zzz;
                Objects.requireNonNull(zzrzVar);
                zzam(zzrzVar.zza);
            }
        } finally {
            this.zzs = null;
            this.zzp = null;
            this.zzaf = null;
            zzaI();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzaH() {
        zzao();
        zzaR();
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzG = -9223372036854775807L;
        this.zzU = false;
        this.zzD = false;
        this.zzE = false;
        this.zzL = false;
        this.zzM = false;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zzR = this.zzQ ? 1 : 0;
    }

    protected final void zzaI() {
        zzaH();
        this.zzx = null;
        this.zzz = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = false;
        this.zzW = false;
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzB = false;
        this.zzC = false;
        this.zzF = false;
        this.zzQ = false;
        this.zzR = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaJ() throws zzhs {
        boolean zzaK = zzaK();
        if (zzaK) {
            zzaC();
        }
        return zzaK;
    }

    protected final boolean zzaK() {
        if (this.zzs == null) {
            return false;
        }
        int i10 = this.zzT;
        if (i10 != 3 && ((!this.zzB || this.zzW) && (!this.zzC || !this.zzV))) {
            if (i10 == 2) {
                int i11 = zzeh.zza;
                try {
                    zzaT();
                } catch (zzhs e8) {
                    zzdn.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e8);
                    zzaG();
                    return true;
                }
            }
            zzah();
            return false;
        }
        zzaG();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaL() {
        return this.zzN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaM(zzz zzzVar) {
        return this.zzag == null && zzas(zzzVar);
    }

    protected boolean zzaN(zzz zzzVar) throws zzhs {
        return true;
    }

    protected boolean zzaO(zzrz zzrzVar) {
        return true;
    }

    protected boolean zzaP(zzha zzhaVar) {
        return false;
    }

    protected abstract int zzaa(zzsi zzsiVar, zzz zzzVar) throws zzsn;

    protected zzhk zzab(zzrz zzrzVar, zzz zzzVar, zzz zzzVar2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (zzaU() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
        if (zzaU() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
        if (zzaU() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzhk zzac(com.google.android.gms.internal.ads.zzjv r12) throws com.google.android.gms.internal.ads.zzhs {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsg.zzac(com.google.android.gms.internal.ads.zzjv):com.google.android.gms.internal.ads.zzhk");
    }

    protected abstract zzrt zzaf(zzrz zzrzVar, zzz zzzVar, MediaCrypto mediaCrypto, float f10);

    protected abstract List zzag(zzsi zzsiVar, zzz zzzVar, boolean z10) throws zzsn;

    protected void zzaj(zzha zzhaVar) throws zzhs {
        throw null;
    }

    protected void zzak(Exception exc) {
        throw null;
    }

    protected void zzal(String str, zzrt zzrtVar, long j10, long j11) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(zzz zzzVar, MediaFormat mediaFormat) throws zzhs {
        throw null;
    }

    protected void zzap() {
    }

    protected void zzaq() throws zzhs {
        throw null;
    }

    protected abstract boolean zzar(long j10, long j11, zzrw zzrwVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzz zzzVar) throws zzhs;

    protected boolean zzas(zzz zzzVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float zzat() {
        return this.zzq;
    }

    protected int zzau(zzha zzhaVar) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzav() {
        return this.zzac.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzaw() {
        return this.zzac.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzkz zzay() {
        return this.zzo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzrw zzaz() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzld
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzkv
    public void zzu(int i10, Object obj) throws zzhs {
        if (i10 == 11) {
            zzkz zzkzVar = (zzkz) obj;
            Objects.requireNonNull(zzkzVar);
            this.zzo = zzkzVar;
            zzaF(zzkzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhi
    public void zzx() {
        this.zzm = null;
        zzaS(zzse.zza);
        this.zzk.clear();
        zzaK();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhi
    public void zzy(boolean z10, boolean z11) throws zzhs {
        this.zza = new zzhj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhi
    public void zzz(long j10, boolean z10) throws zzhs {
        this.zzZ = false;
        this.zzaa = false;
        if (this.zzN) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzO = false;
            this.zzl.zzb();
        } else {
            zzaJ();
        }
        zzed zzedVar = this.zzac.zze;
        if (zzedVar.zza() > 0) {
            this.zzab = true;
        }
        zzedVar.zze();
        this.zzk.clear();
    }
}
