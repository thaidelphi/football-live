package com.applovin.impl;

import com.applovin.impl.s4;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j3 extends o4 {
    public static final o4 A7;
    public static final o4 B7;
    public static final o4 C6 = o4.a("afi", "");
    public static final o4 C7;
    public static final o4 D6;
    public static final o4 D7;
    public static final o4 E6;
    public static final o4 E7;
    public static final o4 F6;
    public static final o4 F7;
    public static final o4 G6;
    public static final o4 G7;
    public static final o4 H6;
    public static final o4 H7;
    public static final o4 I6;
    public static final o4 I7;
    public static final o4 J6;
    public static final o4 J7;
    public static final o4 K6;
    public static final o4 K7;
    public static final o4 L6;
    public static final o4 L7;
    public static final o4 M6;
    public static final o4 N6;
    public static final o4 O6;
    public static final o4 P6;
    public static final o4 Q6;
    public static final o4 R6;
    public static final o4 S6;
    public static final o4 T6;
    public static final o4 U6;
    public static final o4 V6;
    public static final o4 W6;
    public static final o4 X6;
    public static final o4 Y6;
    public static final o4 Z6;

    /* renamed from: a7  reason: collision with root package name */
    public static final o4 f7299a7;

    /* renamed from: b7  reason: collision with root package name */
    public static final o4 f7300b7;

    /* renamed from: c7  reason: collision with root package name */
    public static final o4 f7301c7;

    /* renamed from: d7  reason: collision with root package name */
    public static final o4 f7302d7;

    /* renamed from: e7  reason: collision with root package name */
    public static final o4 f7303e7;

    /* renamed from: f7  reason: collision with root package name */
    public static final o4 f7304f7;

    /* renamed from: g7  reason: collision with root package name */
    public static final o4 f7305g7;

    /* renamed from: h7  reason: collision with root package name */
    public static final o4 f7306h7;

    /* renamed from: i7  reason: collision with root package name */
    public static final o4 f7307i7;

    /* renamed from: j7  reason: collision with root package name */
    public static final o4 f7308j7;

    /* renamed from: k7  reason: collision with root package name */
    public static final o4 f7309k7;

    /* renamed from: l7  reason: collision with root package name */
    public static final o4 f7310l7;
    public static final o4 m7;

    /* renamed from: n7  reason: collision with root package name */
    public static final o4 f7311n7;

    /* renamed from: o7  reason: collision with root package name */
    public static final o4 f7312o7;

    /* renamed from: p7  reason: collision with root package name */
    public static final o4 f7313p7;

    /* renamed from: q7  reason: collision with root package name */
    public static final o4 f7314q7;

    /* renamed from: r7  reason: collision with root package name */
    public static final o4 f7315r7;

    /* renamed from: s7  reason: collision with root package name */
    public static final o4 f7316s7;

    /* renamed from: t7  reason: collision with root package name */
    public static final o4 f7317t7;

    /* renamed from: u7  reason: collision with root package name */
    public static final o4 f7318u7;

    /* renamed from: v7  reason: collision with root package name */
    public static final o4 f7319v7;

    /* renamed from: w7  reason: collision with root package name */
    public static final o4 f7320w7;

    /* renamed from: x7  reason: collision with root package name */
    public static final o4 f7321x7;

    /* renamed from: y7  reason: collision with root package name */
    public static final o4 f7322y7;

    /* renamed from: z7  reason: collision with root package name */
    public static final o4 f7323z7;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        D6 = o4.a("afi_ms", Long.valueOf(timeUnit.toMillis(5L)));
        E6 = o4.a("mediation_endpoint", "https://ms.applovin.com/");
        F6 = o4.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        G6 = o4.a("fetch_next_ad_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        H6 = o4.a("fetch_next_ad_timeout_ms", Long.valueOf(timeUnit.toMillis(30L)));
        I6 = o4.a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(timeUnit.toMillis(7L)));
        Boolean bool = Boolean.TRUE;
        J6 = o4.a("auto_init_mediation_debugger", bool);
        K6 = o4.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        L6 = o4.a("max_signal_provider_latency_ms", Long.valueOf(timeUnit.toMillis(30L)));
        M6 = o4.a("default_adapter_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        N6 = o4.a("ad_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        O6 = o4.a("ad_load_failure_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        P6 = o4.a("ad_load_failure_refresh_ignore_error_codes", "204");
        Q6 = o4.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        R6 = o4.a("refresh_ad_view_timer_responds_to_background", bool);
        S6 = o4.a("refresh_ad_view_timer_responds_to_store_kit", bool);
        Boolean bool2 = Boolean.FALSE;
        T6 = o4.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        U6 = o4.a("avrsponse", bool2);
        V6 = o4.a("allow_pause_auto_refresh_immediately", bool2);
        W6 = o4.a("ad_view_race_condition_fix_enabled", bool2);
        X6 = o4.a("fullscreen_display_delay_ms", 0L);
        Y6 = o4.a("susaode", bool2);
        Z6 = o4.a("ahdm", 500L);
        f7299a7 = o4.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        f7300b7 = o4.a("ad_view_refresh_precache_request_enabled", bool);
        f7301c7 = o4.a("famttl_ms", 0L);
        f7302d7 = o4.a("signal_expiration_ms", -1L);
        f7303e7 = o4.a("signal_cache_level", Integer.valueOf(s4.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        f7304f7 = o4.a("ad_expiration_ms", Long.valueOf(timeUnit2.toMillis(4L)));
        f7305g7 = o4.a("native_ad_expiration_ms", Long.valueOf(timeUnit2.toMillis(4L)));
        f7306h7 = o4.a("rena", bool);
        f7307i7 = o4.a("fullscreen_ad_displayed_timeout_ms", -1L);
        f7308j7 = o4.a("freast_ms", -1L);
        f7309k7 = o4.a("ad_hidden_timeout_ms", -1L);
        f7310l7 = o4.a("schedule_ad_hidden_on_ad_dismiss", bool2);
        m7 = o4.a("schedule_ad_hidden_on_single_task_app_relaunch", bool2);
        f7311n7 = o4.a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f7312o7 = o4.a("proe", bool2);
        f7313p7 = o4.a("mute_state", 2);
        f7314q7 = o4.a("saf", "");
        f7315r7 = o4.a("saui", "");
        f7316s7 = o4.a("mra", -1);
        f7317t7 = o4.a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        f7318u7 = o4.a("svadfr", bool2);
        f7319v7 = o4.a("fadiafase", bool);
        f7320w7 = o4.a("fadwvcv", bool);
        f7321x7 = o4.a("bfarud", bool2);
        f7322y7 = o4.a("inacc", Boolean.valueOf(d7.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        f7323z7 = o4.a("pbataipaf", "");
        A7 = o4.a("bwt_ms", Long.valueOf(timeUnit.toMillis(30L)));
        B7 = o4.a("twt_ms", Long.valueOf(timeUnit.toMillis(30L)));
        C7 = o4.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        D7 = o4.a("faomq", bool2);
        E7 = o4.a("rahcnct_sec", -1);
        F7 = o4.a("uabta", bool2);
        G7 = o4.a("use_initialization_spec_during_init", bool2);
        H7 = o4.a("report_cimp_after_ierr", bool2);
        I7 = o4.a("fail_collection_for_empty_signal", bool2);
        J7 = o4.a("sdaomq", bool2);
        K7 = o4.a("fetch_mediated_ad_gzip", bool);
        L7 = o4.a("max_postback_gzip", bool);
    }
}
