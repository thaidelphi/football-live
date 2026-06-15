package com.ironsource;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class er {

    /* renamed from: a  reason: collision with root package name */
    public static a f17293a = new a(2001, a("initsdk"));

    /* renamed from: b  reason: collision with root package name */
    public static a f17294b = new a(2026, a("sdkrecoverstart"));

    /* renamed from: c  reason: collision with root package name */
    public static a f17295c = new a(2002, a("createcontrollerweb"));

    /* renamed from: d  reason: collision with root package name */
    public static a f17296d = new a(2003, a("createcontrollernative"));

    /* renamed from: e  reason: collision with root package name */
    public static a f17297e = new a(2004, a("controllerstageready"));

    /* renamed from: f  reason: collision with root package name */
    public static a f17298f = new a(2005, a("loadad"));

    /* renamed from: g  reason: collision with root package name */
    public static a f17299g = new a(2006, a("loadadfailed"));

    /* renamed from: h  reason: collision with root package name */
    public static a f17300h = new a(2007, a("initproduct"));

    /* renamed from: i  reason: collision with root package name */
    public static a f17301i = new a(AdError.REMOTE_ADS_SERVICE_ERROR, a("initproductfailed"));

    /* renamed from: j  reason: collision with root package name */
    public static a f17302j = new a(AdError.INTERSTITIAL_AD_TIMEOUT, a("loadproduct"));

    /* renamed from: k  reason: collision with root package name */
    public static a f17303k = new a(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, a("parseadmfailed"));

    /* renamed from: l  reason: collision with root package name */
    public static a f17304l = new a(2011, a("loadadsuccess"));

    /* renamed from: m  reason: collision with root package name */
    public static a f17305m = new a(2027, a("destroyproduct"));

    /* renamed from: n  reason: collision with root package name */
    public static a f17306n = new a(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, a("registerad"));

    /* renamed from: o  reason: collision with root package name */
    public static a f17307o = new a(2013, a("controllerfailed"));

    /* renamed from: p  reason: collision with root package name */
    public static a f17308p = new a(2015, a("appendnativefeaturesdatafailed"));

    /* renamed from: q  reason: collision with root package name */
    public static a f17309q = new a(2016, a("adunitcouldnotloadtowebview"));

    /* renamed from: r  reason: collision with root package name */
    public static a f17310r = new a(2017, a("webviewcleanupfailed"));

    /* renamed from: s  reason: collision with root package name */
    public static a f17311s = new a(2018, a("removewebviewfailed"));

    /* renamed from: t  reason: collision with root package name */
    public static a f17312t = new a(2020, a("banneralreadydestroyed"));

    /* renamed from: u  reason: collision with root package name */
    public static a f17313u = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, a("fialedregactlifecycle"));

    /* renamed from: v  reason: collision with root package name */
    public static a f17314v = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, a("loadcontrollerhtml"));

    /* renamed from: w  reason: collision with root package name */
    public static a f17315w = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, a("controllerhtmlsuccess"));

    /* renamed from: x  reason: collision with root package name */
    public static a f17316x = new a(2024, a("controllerhtmlfailed"));

    /* renamed from: y  reason: collision with root package name */
    public static a f17317y = new a(2025, a("webviewcrashrpg"));

    /* renamed from: z  reason: collision with root package name */
    public static a f17318z = new a(2031, a("getorientationcalled"));
    public static a A = new a(2032, a("webviewunavailable"));
    public static final a B = new a(2033, a("controller_init_delayed"));

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f17319a;

        /* renamed from: b  reason: collision with root package name */
        int f17320b;

        a(int i10, String str) {
            this.f17320b = i10;
            this.f17319a = str;
        }
    }

    static String a(String str) {
        return cc.f16861c + str;
    }
}
