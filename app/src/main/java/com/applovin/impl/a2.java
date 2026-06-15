package com.applovin.impl;

import android.net.Uri;
import android.text.format.Formatter;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a2 {
    public static Map a(com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        if (bVar == null) {
            return hashMap;
        }
        com.applovin.impl.sdk.j sdk = bVar.getSdk();
        if (((Boolean) sdk.a(o4.M)).booleanValue()) {
            HashMap hashMap2 = new HashMap();
            for (Uri uri : bVar.i()) {
                String path = uri.getPath();
                hashMap2.put(path, Formatter.formatFileSize(com.applovin.impl.sdk.j.m(), new File(path).length()));
            }
            hashMap.put("path", hashMap2.toString());
        }
        if ((bVar instanceof com.applovin.impl.sdk.ad.a) && ((Boolean) sdk.a(o4.N)).booleanValue()) {
            hashMap.put("details", ((com.applovin.impl.sdk.ad.a) bVar).e1());
        }
        return hashMap;
    }

    public static Map b(com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap(9);
        if (bVar == null) {
            return hashMap;
        }
        CollectionUtils.putStringIfValid("ad_domain", bVar.getAdDomain(), hashMap);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(bVar.getAdIdNumber()), hashMap);
        MaxAdFormat d10 = bVar.getAdZone().d();
        CollectionUtils.putStringIfValid("ad_format", d10 != null ? d10.getLabel() : null, hashMap);
        CollectionUtils.putStringIfValid("ad_zone_id", bVar.getAdZone().e(), hashMap);
        CollectionUtils.putStringIfValid("clcode", bVar.getClCode(), hashMap);
        CollectionUtils.putStringIfValid("dsp_id", bVar.getDspId(), hashMap);
        CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), hashMap);
        CollectionUtils.putStringIfValid("ad_size", bVar.getSize().getLabel(), hashMap);
        CollectionUtils.putStringIfValid("is_persisted_ad", String.valueOf(bVar.C0()), hashMap);
        return hashMap;
    }

    public static Map a(u2 u2Var) {
        Map a10 = a((d3) u2Var);
        CollectionUtils.putStringIfValid("bcode", u2Var.C(), a10);
        CollectionUtils.putStringIfValid("creative_id", u2Var.getCreativeId(), a10);
        CollectionUtils.putStringIfValid("ad_unit_id", u2Var.getAdUnitId(), a10);
        CollectionUtils.putStringIfValid("ad_format", u2Var.getFormat().getLabel(), a10);
        return a10;
    }

    public static Map a(d3 d3Var) {
        HashMap hashMap = new HashMap(3);
        CollectionUtils.putStringIfValid("network_name", d3Var.c(), hashMap);
        String b10 = d3Var.b();
        CollectionUtils.putStringIfValid("adapter_class", b10, hashMap);
        CollectionUtils.putStringIfValid("adapter_version", o3.a(b10).getAdapterVersion(), hashMap);
        return hashMap;
    }

    public static Map a(MaxError maxError) {
        HashMap hashMap = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), hashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), hashMap);
        return hashMap;
    }
}
