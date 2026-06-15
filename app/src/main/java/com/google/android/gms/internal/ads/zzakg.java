package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.appnext.banners.BannerAdRequest;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.ug;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzakg implements zzajg {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzake zzh = new zzake(30.0f, 1, 1);

    public zzakg() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
        if (r13.equals("s") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzake r14) throws com.google.android.gms.internal.ads.zzajc {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakg.zzc(java.lang.String, com.google.android.gms.internal.ads.zzake):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzd(String str) {
        char c10;
        String zza2 = zzfsb.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3317767:
                if (zza2.equals("left")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c10 == 2 || c10 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c10 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzakj zze(zzakj zzakjVar) {
        return zzakjVar == null ? new zzakj() : zzakjVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static zzakj zzf(XmlPullParser xmlPullParser, zzakj zzakjVar) {
        char c10;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            char c11 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals(cc.f16874p)) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals(ug.f21009x)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(b9.h.S)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        zzakjVar = zze(zzakjVar);
                        zzakjVar.zzt(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    zzakjVar = zze(zzakjVar);
                    try {
                        zzakjVar.zzm(zzcy.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzdn.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzakjVar = zze(zzakjVar);
                    try {
                        zzakjVar.zzp(zzcy.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzdn.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzq(attributeValue);
                    break;
                case 4:
                    try {
                        zzakjVar = zze(zzakjVar);
                        int i11 = zzeh.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else if (length == 2) {
                            matcher = zze.matcher(split[1]);
                            zzdn.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        } else {
                            throw new zzajc("Invalid number of entries for fontSize: " + length + ".");
                        }
                        if (matcher.matches()) {
                            String group = matcher.group(3);
                            Objects.requireNonNull(group);
                            int hashCode = group.hashCode();
                            if (hashCode != 37) {
                                if (hashCode != 3240) {
                                    if (hashCode == 3592 && group.equals("px")) {
                                        c11 = 0;
                                    }
                                } else if (group.equals("em")) {
                                    c11 = 1;
                                }
                            } else if (group.equals("%")) {
                                c11 = 2;
                            }
                            if (c11 == 0) {
                                zzakjVar.zzs(1);
                            } else if (c11 == 1) {
                                zzakjVar.zzs(2);
                            } else if (c11 == 2) {
                                zzakjVar.zzs(3);
                            } else {
                                throw new zzajc("Invalid unit for fontSize: '" + group + "'.");
                            }
                            String group2 = matcher.group(1);
                            Objects.requireNonNull(group2);
                            zzakjVar.zzr(Float.parseFloat(group2));
                            break;
                        } else {
                            throw new zzajc("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                    } catch (zzajc unused3) {
                        zzdn.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzu("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzB(zzd(attributeValue));
                    break;
                case '\b':
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzw(zzd(attributeValue));
                    break;
                case '\t':
                    String zza2 = zzfsb.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals("none")) {
                            c11 = 0;
                        }
                    } else if (zza2.equals(BannerAdRequest.TYPE_ALL)) {
                        c11 = 1;
                    }
                    if (c11 != 0) {
                        if (c11 != 1) {
                            break;
                        } else {
                            zzakjVar = zze(zzakjVar);
                            zzakjVar.zzC(true);
                            break;
                        }
                    } else {
                        zzakjVar = zze(zzakjVar);
                        zzakjVar.zzC(false);
                        break;
                    }
                case '\n':
                    String zza3 = zzfsb.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                c11 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                c11 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals(b9.h.K0)) {
                                c11 = 3;
                                break;
                            }
                            break;
                    }
                    if (c11 != 0) {
                        if (c11 != 1 && c11 != 2) {
                            if (c11 != 3 && c11 != 4) {
                                if (c11 != 5) {
                                    break;
                                } else {
                                    zzakjVar = zze(zzakjVar);
                                    zzakjVar.zzz(4);
                                    break;
                                }
                            } else {
                                zzakjVar = zze(zzakjVar);
                                zzakjVar.zzz(3);
                                break;
                            }
                        } else {
                            zzakjVar = zze(zzakjVar);
                            zzakjVar.zzz(2);
                            break;
                        }
                    } else {
                        zzakjVar = zze(zzakjVar);
                        zzakjVar.zzz(1);
                        break;
                    }
                case 11:
                    String zza4 = zzfsb.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            c11 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        c11 = 0;
                    }
                    if (c11 != 0) {
                        if (c11 != 1) {
                            break;
                        } else {
                            zzakjVar = zze(zzakjVar);
                            zzakjVar.zzy(2);
                            break;
                        }
                    } else {
                        zzakjVar = zze(zzakjVar);
                        zzakjVar.zzy(1);
                        break;
                    }
                case '\f':
                    String zza5 = zzfsb.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                c11 = 0;
                                break;
                            }
                            break;
                    }
                    if (c11 != 0) {
                        if (c11 != 1) {
                            if (c11 != 2) {
                                if (c11 != 3) {
                                    break;
                                } else {
                                    zzakjVar = zze(zzakjVar);
                                    zzakjVar.zzE(false);
                                    break;
                                }
                            } else {
                                zzakjVar = zze(zzakjVar);
                                zzakjVar.zzE(true);
                                break;
                            }
                        } else {
                            zzakjVar = zze(zzakjVar);
                            zzakjVar.zzv(false);
                            break;
                        }
                    } else {
                        zzakjVar = zze(zzakjVar);
                        zzakjVar.zzv(true);
                        break;
                    }
                case '\r':
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzD(zzakc.zza(attributeValue));
                    break;
                case 14:
                    zzakjVar = zze(zzakjVar);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f10 = Float.MAX_VALUE;
                    if (!matcher2.matches()) {
                        zzdn.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    } else {
                        try {
                            String group3 = matcher2.group(1);
                            Objects.requireNonNull(group3);
                            f10 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                        } catch (NumberFormatException e8) {
                            zzdn.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e8);
                        }
                    }
                    zzakjVar.zzA(f10);
                    break;
                case 15:
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzx(attributeValue);
                    break;
                case 16:
                    zzakjVar = zze(zzakjVar);
                    zzakjVar.zzo(attributeValue);
                    break;
            }
        }
        return zzakjVar;
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i10 = zzeh.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        zzaja.zza(zzb(bArr, i10, i11), zzajfVar, zzdaVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0270 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0701, LOOP:1: B:113:0x0270->B:266:0x0516, LOOP_START, PHI: r3 r11 
      PHI: (r3v37 java.lang.String) = (r3v7 java.lang.String), (r3v62 java.lang.String) binds: [B:112:0x026e, B:266:0x0516] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v33 com.google.android.gms.internal.ads.zzake) = (r11v7 com.google.android.gms.internal.ads.zzake), (r11v50 com.google.android.gms.internal.ads.zzake) binds: [B:112:0x026e, B:266:0x0516] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06f7, XmlPullParserException -> 0x0701, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01cf, B:81:0x01df, B:83:0x01e5, B:85:0x01ed, B:87:0x01f5, B:89:0x01fd, B:91:0x0205, B:93:0x020d, B:95:0x0213, B:97:0x021b, B:99:0x0223, B:101:0x0229, B:103:0x022f, B:105:0x0237, B:107:0x023f, B:110:0x0248, B:398:0x06e0, B:111:0x026a, B:113:0x0270, B:115:0x0279, B:117:0x0288, B:119:0x0292, B:121:0x02a6, B:123:0x02ac, B:263:0x0508, B:124:0x02b0, B:127:0x02ba, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:134:0x02d8, B:137:0x02e2, B:262:0x0503, B:141:0x02ed, B:143:0x02f5, B:145:0x02fb, B:147:0x0303, B:149:0x0309, B:152:0x031c, B:154:0x0323, B:156:0x0332, B:175:0x0390, B:177:0x039a, B:179:0x03a0, B:181:0x03a8, B:183:0x03ae, B:186:0x03c3, B:188:0x03ca, B:190:0x03d9, B:208:0x0457, B:210:0x045f, B:231:0x04a5, B:233:0x04ad, B:260:0x04f6, B:192:0x03e6, B:193:0x03f5, B:196:0x03fd, B:199:0x040d, B:201:0x0414, B:203:0x0420, B:205:0x0433, B:206:0x0442, B:159:0x033a, B:160:0x0344, B:163:0x034c, B:166:0x0357, B:168:0x035e, B:170:0x036a, B:172:0x0378, B:173:0x0383, B:268:0x051e, B:271:0x053f, B:321:0x05e0, B:305:0x059d, B:307:0x05a5, B:373:0x067d, B:308:0x05ab, B:311:0x05b5, B:318:0x05cc, B:319:0x05d1, B:320:0x05d9, B:328:0x05f8, B:359:0x0653, B:361:0x0663, B:363:0x0668, B:351:0x0641, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b8, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:379:0x0697, B:382:0x06a6, B:384:0x06b0, B:386:0x06bb, B:388:0x06c1, B:391:0x06d1, B:395:0x06d9), top: B:440:0x0006, inners: #1, #6, #8, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04ad A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0701, TRY_LEAVE, TryCatch #17 {IOException -> 0x06f7, XmlPullParserException -> 0x0701, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01cf, B:81:0x01df, B:83:0x01e5, B:85:0x01ed, B:87:0x01f5, B:89:0x01fd, B:91:0x0205, B:93:0x020d, B:95:0x0213, B:97:0x021b, B:99:0x0223, B:101:0x0229, B:103:0x022f, B:105:0x0237, B:107:0x023f, B:110:0x0248, B:398:0x06e0, B:111:0x026a, B:113:0x0270, B:115:0x0279, B:117:0x0288, B:119:0x0292, B:121:0x02a6, B:123:0x02ac, B:263:0x0508, B:124:0x02b0, B:127:0x02ba, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:134:0x02d8, B:137:0x02e2, B:262:0x0503, B:141:0x02ed, B:143:0x02f5, B:145:0x02fb, B:147:0x0303, B:149:0x0309, B:152:0x031c, B:154:0x0323, B:156:0x0332, B:175:0x0390, B:177:0x039a, B:179:0x03a0, B:181:0x03a8, B:183:0x03ae, B:186:0x03c3, B:188:0x03ca, B:190:0x03d9, B:208:0x0457, B:210:0x045f, B:231:0x04a5, B:233:0x04ad, B:260:0x04f6, B:192:0x03e6, B:193:0x03f5, B:196:0x03fd, B:199:0x040d, B:201:0x0414, B:203:0x0420, B:205:0x0433, B:206:0x0442, B:159:0x033a, B:160:0x0344, B:163:0x034c, B:166:0x0357, B:168:0x035e, B:170:0x036a, B:172:0x0378, B:173:0x0383, B:268:0x051e, B:271:0x053f, B:321:0x05e0, B:305:0x059d, B:307:0x05a5, B:373:0x067d, B:308:0x05ab, B:311:0x05b5, B:318:0x05cc, B:319:0x05d1, B:320:0x05d9, B:328:0x05f8, B:359:0x0653, B:361:0x0663, B:363:0x0668, B:351:0x0641, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b8, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:379:0x0697, B:382:0x06a6, B:384:0x06b0, B:386:0x06bb, B:388:0x06c1, B:391:0x06d1, B:395:0x06d9), top: B:440:0x0006, inners: #1, #6, #8, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0503 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0701, TryCatch #17 {IOException -> 0x06f7, XmlPullParserException -> 0x0701, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01cf, B:81:0x01df, B:83:0x01e5, B:85:0x01ed, B:87:0x01f5, B:89:0x01fd, B:91:0x0205, B:93:0x020d, B:95:0x0213, B:97:0x021b, B:99:0x0223, B:101:0x0229, B:103:0x022f, B:105:0x0237, B:107:0x023f, B:110:0x0248, B:398:0x06e0, B:111:0x026a, B:113:0x0270, B:115:0x0279, B:117:0x0288, B:119:0x0292, B:121:0x02a6, B:123:0x02ac, B:263:0x0508, B:124:0x02b0, B:127:0x02ba, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:134:0x02d8, B:137:0x02e2, B:262:0x0503, B:141:0x02ed, B:143:0x02f5, B:145:0x02fb, B:147:0x0303, B:149:0x0309, B:152:0x031c, B:154:0x0323, B:156:0x0332, B:175:0x0390, B:177:0x039a, B:179:0x03a0, B:181:0x03a8, B:183:0x03ae, B:186:0x03c3, B:188:0x03ca, B:190:0x03d9, B:208:0x0457, B:210:0x045f, B:231:0x04a5, B:233:0x04ad, B:260:0x04f6, B:192:0x03e6, B:193:0x03f5, B:196:0x03fd, B:199:0x040d, B:201:0x0414, B:203:0x0420, B:205:0x0433, B:206:0x0442, B:159:0x033a, B:160:0x0344, B:163:0x034c, B:166:0x0357, B:168:0x035e, B:170:0x036a, B:172:0x0378, B:173:0x0383, B:268:0x051e, B:271:0x053f, B:321:0x05e0, B:305:0x059d, B:307:0x05a5, B:373:0x067d, B:308:0x05ab, B:311:0x05b5, B:318:0x05cc, B:319:0x05d1, B:320:0x05d9, B:328:0x05f8, B:359:0x0653, B:361:0x0663, B:363:0x0668, B:351:0x0641, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b8, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:379:0x0697, B:382:0x06a6, B:384:0x06b0, B:386:0x06bb, B:388:0x06c1, B:391:0x06d1, B:395:0x06d9), top: B:440:0x0006, inners: #1, #6, #8, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0516 A[LOOP:1: B:113:0x0270->B:266:0x0516, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0668 A[Catch: zzajc -> 0x0671, IOException -> 0x06f7, XmlPullParserException -> 0x0701, TRY_LEAVE, TryCatch #7 {zzajc -> 0x0671, blocks: (B:361:0x0663, B:363:0x0668), top: B:422:0x0663 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x050e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0701, TryCatch #17 {IOException -> 0x06f7, XmlPullParserException -> 0x0701, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01cf, B:81:0x01df, B:83:0x01e5, B:85:0x01ed, B:87:0x01f5, B:89:0x01fd, B:91:0x0205, B:93:0x020d, B:95:0x0213, B:97:0x021b, B:99:0x0223, B:101:0x0229, B:103:0x022f, B:105:0x0237, B:107:0x023f, B:110:0x0248, B:398:0x06e0, B:111:0x026a, B:113:0x0270, B:115:0x0279, B:117:0x0288, B:119:0x0292, B:121:0x02a6, B:123:0x02ac, B:263:0x0508, B:124:0x02b0, B:127:0x02ba, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:134:0x02d8, B:137:0x02e2, B:262:0x0503, B:141:0x02ed, B:143:0x02f5, B:145:0x02fb, B:147:0x0303, B:149:0x0309, B:152:0x031c, B:154:0x0323, B:156:0x0332, B:175:0x0390, B:177:0x039a, B:179:0x03a0, B:181:0x03a8, B:183:0x03ae, B:186:0x03c3, B:188:0x03ca, B:190:0x03d9, B:208:0x0457, B:210:0x045f, B:231:0x04a5, B:233:0x04ad, B:260:0x04f6, B:192:0x03e6, B:193:0x03f5, B:196:0x03fd, B:199:0x040d, B:201:0x0414, B:203:0x0420, B:205:0x0433, B:206:0x0442, B:159:0x033a, B:160:0x0344, B:163:0x034c, B:166:0x0357, B:168:0x035e, B:170:0x036a, B:172:0x0378, B:173:0x0383, B:268:0x051e, B:271:0x053f, B:321:0x05e0, B:305:0x059d, B:307:0x05a5, B:373:0x067d, B:308:0x05ab, B:311:0x05b5, B:318:0x05cc, B:319:0x05d1, B:320:0x05d9, B:328:0x05f8, B:359:0x0653, B:361:0x0663, B:363:0x0668, B:351:0x0641, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b8, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:379:0x0697, B:382:0x06a6, B:384:0x06b0, B:386:0x06bb, B:388:0x06c1, B:391:0x06d1, B:395:0x06d9), top: B:440:0x0006, inners: #1, #6, #8, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01df A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0701, TRY_ENTER, TryCatch #17 {IOException -> 0x06f7, XmlPullParserException -> 0x0701, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01cf, B:81:0x01df, B:83:0x01e5, B:85:0x01ed, B:87:0x01f5, B:89:0x01fd, B:91:0x0205, B:93:0x020d, B:95:0x0213, B:97:0x021b, B:99:0x0223, B:101:0x0229, B:103:0x022f, B:105:0x0237, B:107:0x023f, B:110:0x0248, B:398:0x06e0, B:111:0x026a, B:113:0x0270, B:115:0x0279, B:117:0x0288, B:119:0x0292, B:121:0x02a6, B:123:0x02ac, B:263:0x0508, B:124:0x02b0, B:127:0x02ba, B:129:0x02c0, B:131:0x02cb, B:133:0x02d1, B:134:0x02d8, B:137:0x02e2, B:262:0x0503, B:141:0x02ed, B:143:0x02f5, B:145:0x02fb, B:147:0x0303, B:149:0x0309, B:152:0x031c, B:154:0x0323, B:156:0x0332, B:175:0x0390, B:177:0x039a, B:179:0x03a0, B:181:0x03a8, B:183:0x03ae, B:186:0x03c3, B:188:0x03ca, B:190:0x03d9, B:208:0x0457, B:210:0x045f, B:231:0x04a5, B:233:0x04ad, B:260:0x04f6, B:192:0x03e6, B:193:0x03f5, B:196:0x03fd, B:199:0x040d, B:201:0x0414, B:203:0x0420, B:205:0x0433, B:206:0x0442, B:159:0x033a, B:160:0x0344, B:163:0x034c, B:166:0x0357, B:168:0x035e, B:170:0x036a, B:172:0x0378, B:173:0x0383, B:268:0x051e, B:271:0x053f, B:321:0x05e0, B:305:0x059d, B:307:0x05a5, B:373:0x067d, B:308:0x05ab, B:311:0x05b5, B:318:0x05cc, B:319:0x05d1, B:320:0x05d9, B:328:0x05f8, B:359:0x0653, B:361:0x0663, B:363:0x0668, B:351:0x0641, B:64:0x0182, B:66:0x018e, B:69:0x0199, B:71:0x01a0, B:73:0x01ac, B:75:0x01b8, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:379:0x0697, B:382:0x06a6, B:384:0x06b0, B:386:0x06bb, B:388:0x06c1, B:391:0x06d1, B:395:0x06d9), top: B:440:0x0006, inners: #1, #6, #8, #10, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzajb zzb(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakg.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzajb");
    }
}
