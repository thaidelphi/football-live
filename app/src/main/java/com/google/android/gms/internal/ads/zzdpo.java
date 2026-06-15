package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdpo {
    public static final zzfvv zza;
    public static final zzfvv zzb;
    private final String zzc;
    private final zzdpn zzd;
    private final zzdpn zze;

    static {
        zzdpn zzdpnVar = zzdpn.PUBLIC_API_CALL;
        zzdpn zzdpnVar2 = zzdpn.PUBLIC_API_CALLBACK;
        zzdpo zzdpoVar = new zzdpo("tqgt", zzdpnVar, zzdpnVar2);
        zzdpn zzdpnVar3 = zzdpn.DYNAMITE_ENTER;
        zzdpo zzdpoVar2 = new zzdpo("l.dl", zzdpnVar, zzdpnVar3);
        zzdpn zzdpnVar4 = zzdpn.READ_FROM_DISK_START;
        zzdpo zzdpoVar3 = new zzdpo("l.rccde", zzdpnVar3, zzdpnVar4);
        zzdpo zzdpoVar4 = new zzdpo("l.rfd", zzdpnVar4, zzdpn.READ_FROM_DISK_END);
        zzdpn zzdpnVar5 = zzdpn.CLIENT_SIGNALS_START;
        zzdpo zzdpoVar5 = new zzdpo("l.rcc", zzdpnVar3, zzdpnVar5);
        zzdpn zzdpnVar6 = zzdpn.CLIENT_SIGNALS_END;
        zzdpo zzdpoVar6 = new zzdpo("l.cs", zzdpnVar5, zzdpnVar6);
        zzdpn zzdpnVar7 = zzdpn.SERVICE_CONNECTED;
        zzdpo zzdpoVar7 = new zzdpo("l.cts", zzdpnVar6, zzdpnVar7);
        zzdpn zzdpnVar8 = zzdpn.GMS_SIGNALS_START;
        zzdpn zzdpnVar9 = zzdpn.GMS_SIGNALS_END;
        zzdpo zzdpoVar8 = new zzdpo("l.gs", zzdpnVar8, zzdpnVar9);
        zzdpn zzdpnVar10 = zzdpn.GET_SIGNALS_SDKCORE_START;
        zzdpo zzdpoVar9 = new zzdpo("l.jse", zzdpnVar9, zzdpnVar10);
        zzdpn zzdpnVar11 = zzdpn.GET_SIGNALS_SDKCORE_END;
        zzdpo zzdpoVar10 = new zzdpo("l.gs-sdkcore", zzdpnVar10, zzdpnVar11);
        zzdpo zzdpoVar11 = new zzdpo("l.gs-pp", zzdpnVar11, zzdpnVar2);
        zzdpn zzdpnVar12 = zzdpn.RENDERING_START;
        zzdpo zzdpoVar12 = new zzdpo("l.render", zzdpnVar12, zzdpnVar2);
        zzdpn zzdpnVar13 = zzdpn.RENDERING_WEBVIEW_CREATION_START;
        zzdpn zzdpnVar14 = zzdpn.RENDERING_WEBVIEW_CREATION_END;
        zzdpn zzdpnVar15 = zzdpn.RENDERING_AD_COMPONENT_CREATION_END;
        zzdpn zzdpnVar16 = zzdpn.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdpn zzdpnVar17 = zzdpn.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdpn zzdpnVar18 = zzdpn.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdpn zzdpnVar19 = zzdpn.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzfvv.zzt(zzdpoVar, zzdpoVar2, zzdpoVar3, zzdpoVar4, zzdpoVar5, zzdpoVar6, zzdpoVar7, zzdpoVar8, zzdpoVar9, zzdpoVar10, zzdpoVar11, zzdpoVar12, new zzdpo("l.render.pre", zzdpnVar12, zzdpnVar13), new zzdpo("l.render.wvc", zzdpnVar13, zzdpnVar14), new zzdpo("l.render.acc", zzdpnVar14, zzdpnVar15), new zzdpo("l.render.cfg-wv", zzdpnVar16, zzdpnVar17), new zzdpo("l.render.wvlh", zzdpnVar18, zzdpnVar19), new zzdpo("l.render.post", zzdpnVar19, zzdpnVar2), new zzdpo("l.sodv", zzdpn.SIGNAL_ON_DISK_VALIDATION_START, zzdpn.SIGNAL_ON_DISK_VALIDATION_END), new zzdpo("l.sodck", zzdpn.SIGNAL_ON_DISK_CACHE_KEY_START, zzdpn.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdpo("l.sodrar", zzdpn.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdpn.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdpo("l.soddc", zzdpn.SIGNAL_ON_DISK_DECODE_START, zzdpn.SIGNAL_ON_DISK_DECODE_END));
        zzdpo zzdpoVar13 = new zzdpo("l.al", zzdpnVar, zzdpnVar2);
        zzdpo zzdpoVar14 = new zzdpo("l.al2", zzdpnVar3, zzdpnVar2);
        zzdpo zzdpoVar15 = new zzdpo("l.dl", zzdpnVar, zzdpnVar3);
        zzdpo zzdpoVar16 = new zzdpo("l.rcc", zzdpnVar3, zzdpnVar5);
        zzdpo zzdpoVar17 = new zzdpo("l.cs", zzdpnVar5, zzdpnVar6);
        zzdpo zzdpoVar18 = new zzdpo("l.cts", zzdpnVar6, zzdpnVar7);
        zzdpo zzdpoVar19 = new zzdpo("l.gs", zzdpnVar8, zzdpnVar9);
        zzdpn zzdpnVar20 = zzdpn.GET_AD_DICTIONARY_SDKCORE_START;
        zzdpo zzdpoVar20 = new zzdpo("l.jse", zzdpnVar9, zzdpnVar20);
        zzdpn zzdpnVar21 = zzdpn.GET_AD_DICTIONARY_SDKCORE_END;
        zzdpo zzdpoVar21 = new zzdpo("l.gad-js", zzdpnVar20, zzdpnVar21);
        zzdpn zzdpnVar22 = zzdpn.HTTP_RESPONSE_READY;
        zzdpo zzdpoVar22 = new zzdpo("l.http", zzdpnVar21, zzdpnVar22);
        zzdpn zzdpnVar23 = zzdpn.NORMALIZATION_AD_RESPONSE_START;
        zzdpo zzdpoVar23 = new zzdpo("l.jse-nml", zzdpnVar22, zzdpnVar23);
        zzdpn zzdpnVar24 = zzdpn.NORMALIZATION_AD_RESPONSE_END;
        zzdpo zzdpoVar24 = new zzdpo("l.nml-js", zzdpnVar23, zzdpnVar24);
        zzdpn zzdpnVar25 = zzdpn.BINDER_CALL_START;
        zzdpn zzdpnVar26 = zzdpn.SERVER_RESPONSE_PARSE_START;
        zzb = zzfvv.zzt(zzdpoVar13, zzdpoVar14, zzdpoVar15, zzdpoVar16, zzdpoVar17, zzdpoVar18, zzdpoVar19, zzdpoVar20, zzdpoVar21, zzdpoVar22, zzdpoVar23, zzdpoVar24, new zzdpo("l.nml-gmsg", zzdpnVar24, zzdpnVar25), new zzdpo("l.binder", zzdpnVar25, zzdpnVar26), new zzdpo("l.sr", zzdpnVar26, zzdpnVar12), new zzdpo("l.render", zzdpnVar12, zzdpnVar2), new zzdpo("l.t2", zzdpn.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdpn.RENDERING_ADSTRING_TYPE2_FETCH_END), new zzdpo("l.render.wvc", zzdpnVar13, zzdpnVar14), new zzdpo("l.render.acc", zzdpnVar14, zzdpnVar15), new zzdpo("l.render.cfg-wv", zzdpnVar16, zzdpnVar17), new zzdpo("l.render.pre", zzdpnVar12, zzdpnVar13), new zzdpo("l.render.post", zzdpnVar19, zzdpnVar2), new zzdpo("l.render.wvlh", zzdpnVar18, zzdpnVar19));
    }

    public zzdpo(String str, zzdpn zzdpnVar, zzdpn zzdpnVar2) {
        this.zzc = str;
        this.zzd = zzdpnVar;
        this.zze = zzdpnVar2;
    }

    public final zzdpn zza() {
        return this.zzd;
    }

    public final zzdpn zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
