package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzia;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznj;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzon;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpl;
import com.ironsource.b9;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@VisibleForTesting
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeb {
    public static final zzea A;
    public static final zzea A0;
    public static final zzea B;
    public static final zzea B0;
    public static final zzea C;
    public static final zzea C0;
    public static final zzea D;
    public static final zzea D0;
    public static final zzea E;
    public static final zzea F;
    public static final zzea G;
    public static final zzea H;
    public static final zzea I;
    public static final zzea J;
    public static final zzea K;
    public static final zzea L;
    public static final zzea M;
    public static final zzea N;
    public static final zzea O;
    public static final zzea P;
    public static final zzea Q;
    public static final zzea R;
    public static final zzea S;
    public static final zzea T;
    public static final zzea U;
    public static final zzea V;
    public static final zzea W;
    public static final zzea X;
    public static final zzea Y;
    public static final zzea Z;

    /* renamed from: a0 */
    public static final zzea f13405a0;

    /* renamed from: b0 */
    public static final zzea f13407b0;

    /* renamed from: c0 */
    public static final zzea f13409c0;

    /* renamed from: d0 */
    public static final zzea f13411d0;

    /* renamed from: e0 */
    public static final zzea f13413e0;

    /* renamed from: f0 */
    public static final zzea f13415f0;

    /* renamed from: g0 */
    public static final zzea f13417g0;

    /* renamed from: h0 */
    public static final zzea f13419h0;

    /* renamed from: i0 */
    public static final zzea f13421i0;

    /* renamed from: j0 */
    public static final zzea f13423j0;

    /* renamed from: k0 */
    public static final zzea f13425k0;

    /* renamed from: l0 */
    public static final zzea f13427l0;

    /* renamed from: m0 */
    public static final zzea f13429m0;

    /* renamed from: n */
    public static final zzea f13430n;

    /* renamed from: n0 */
    public static final zzea f13431n0;

    /* renamed from: o */
    public static final zzea f13432o;

    /* renamed from: o0 */
    public static final zzea f13433o0;

    /* renamed from: p */
    public static final zzea f13434p;

    /* renamed from: p0 */
    public static final zzea f13435p0;

    /* renamed from: q */
    public static final zzea f13436q;

    /* renamed from: q0 */
    public static final zzea f13437q0;

    /* renamed from: r */
    public static final zzea f13438r;

    /* renamed from: r0 */
    public static final zzea f13439r0;

    /* renamed from: s */
    public static final zzea f13440s;

    /* renamed from: s0 */
    public static final zzea f13441s0;

    /* renamed from: t */
    public static final zzea f13442t;

    /* renamed from: t0 */
    public static final zzea f13443t0;

    /* renamed from: u */
    public static final zzea f13444u;

    /* renamed from: u0 */
    public static final zzea f13445u0;

    /* renamed from: v */
    public static final zzea f13446v;

    /* renamed from: v0 */
    public static final zzea f13447v0;

    /* renamed from: w */
    public static final zzea f13448w;

    /* renamed from: w0 */
    public static final zzea f13449w0;

    /* renamed from: x */
    public static final zzea f13450x;

    /* renamed from: x0 */
    public static final zzea f13451x0;

    /* renamed from: y */
    public static final zzea f13452y;

    /* renamed from: y0 */
    public static final zzea f13453y0;

    /* renamed from: z */
    public static final zzea f13454z;

    /* renamed from: z0 */
    public static final zzea f13455z0;

    /* renamed from: a */
    private static final List f13404a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Set f13406b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final zzea f13408c = a("measurement.ad_id_cache_time", 10000L, 10000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbj
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Long.valueOf(zznm.zzb());
        }
    });

    /* renamed from: d */
    public static final zzea f13410d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbb
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Long.valueOf(zznm.zzl());
        }
    });

    /* renamed from: e */
    public static final zzea f13412e = a("measurement.config.cache_time", 86400000L, 3600000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbn
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Long.valueOf(zznm.zzd());
        }
    });

    /* renamed from: f */
    public static final zzea f13414f = a("measurement.config.url_scheme", HttpRequest.DEFAULT_SCHEME, HttpRequest.DEFAULT_SCHEME, new m() { // from class: com.google.android.gms.measurement.internal.zzbz
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return zznm.zzK();
        }
    });

    /* renamed from: g */
    public static final zzea f13416g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new m() { // from class: com.google.android.gms.measurement.internal.zzcl
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return zznm.zzJ();
        }
    });

    /* renamed from: h */
    public static final zzea f13418h = a("measurement.upload.max_bundles", 100, 100, new m() { // from class: com.google.android.gms.measurement.internal.zzcx
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Integer.valueOf((int) zznm.zzw());
        }
    });

    /* renamed from: i */
    public static final zzea f13420i = a("measurement.upload.max_batch_size", 65536, 65536, new m() { // from class: com.google.android.gms.measurement.internal.zzdj
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Integer.valueOf((int) zznm.zzE());
        }
    });

    /* renamed from: j */
    public static final zzea f13422j = a("measurement.upload.max_bundle_size", 65536, 65536, new m() { // from class: com.google.android.gms.measurement.internal.zzdr
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Integer.valueOf((int) zznm.zzv());
        }
    });

    /* renamed from: k */
    public static final zzea f13424k = a("measurement.upload.max_events_per_bundle", 1000, 1000, new m() { // from class: com.google.android.gms.measurement.internal.zzds
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Integer.valueOf((int) zznm.zzz());
        }
    });

    /* renamed from: l */
    public static final zzea f13426l = a("measurement.upload.max_events_per_day", 100000, 100000, new m() { // from class: com.google.android.gms.measurement.internal.zzdt
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Integer.valueOf((int) zznm.zzA());
        }
    });

    /* renamed from: m */
    public static final zzea f13428m = a("measurement.upload.max_error_events_per_day", 1000, 1000, new m() { // from class: com.google.android.gms.measurement.internal.zzbu
        @Override // com.google.android.gms.measurement.internal.m
        public final Object zza() {
            zzea zzeaVar = zzeb.f13408c;
            return Integer.valueOf((int) zznm.zzy());
        }
    });

    static {
        Integer valueOf = Integer.valueOf((int) b9.b.f16554d);
        f13430n = a("measurement.upload.max_public_events_per_day", valueOf, valueOf, new m() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzB());
            }
        });
        Integer valueOf2 = Integer.valueOf((int) UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        f13432o = a("measurement.upload.max_conversions_per_day", valueOf2, valueOf2, new m() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzx());
            }
        });
        f13434p = a("measurement.upload.max_realtime_events_per_day", 10, 10, new m() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzD());
            }
        });
        f13436q = a("measurement.store.max_stored_events_per_app", 100000, 100000, new m() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzg());
            }
        });
        f13438r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new m() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return zznm.zzL();
            }
        });
        f13440s = a("measurement.upload.backoff_period", 43200000L, 43200000L, new m() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzs());
            }
        });
        f13442t = a("measurement.upload.window_interval", 3600000L, 3600000L, new m() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzH());
            }
        });
        f13444u = a("measurement.upload.interval", 3600000L, 3600000L, new m() { // from class: com.google.android.gms.measurement.internal.zzaz
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzu());
            }
        });
        f13446v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new m() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzm());
            }
        });
        f13448w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zze());
            }
        });
        f13450x = a("measurement.upload.minimum_delay", 500L, 500L, new m() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzk());
            }
        });
        f13452y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzj());
            }
        });
        f13454z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzp());
            }
        });
        A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzn());
            }
        });
        B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzt());
            }
        });
        C = a("measurement.upload.retry_time", 1800000L, 1800000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzG());
            }
        });
        D = a("measurement.upload.retry_count", 6, 6, new m() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzF());
            }
        });
        E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new m() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzC());
            }
        });
        F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new m() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzf());
            }
        });
        G = a("measurement.audience.filter_result_max_count", 200, 200, new m() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzi());
            }
        });
        H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        Integer valueOf3 = Integer.valueOf((int) UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        I = a("measurement.upload.max_event_name_cardinality", valueOf3, valueOf3, null);
        J = a("measurement.upload.max_public_event_params", 25, 25, null);
        Long valueOf4 = Long.valueOf((long) ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        K = a("measurement.service_client.idle_disconnect_millis", valueOf4, valueOf4, new m() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzo());
            }
        });
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzoq.zzg());
            }
        });
        M = a("measurement.test.string_flag", "---", "---", new m() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return zzoq.zzf();
            }
        });
        N = a("measurement.test.long_flag", -1L, -1L, new m() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zzoq.zzd());
            }
        });
        O = a("measurement.test.int_flag", -2, -2, new m() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zzoq.zzc());
            }
        });
        Double valueOf5 = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", valueOf5, valueOf5, new m() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Double.valueOf(zzoq.zzb());
            }
        });
        Q = a("measurement.experiment.max_ids", 50, 50, new m() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzh());
            }
        });
        R = a("measurement.max_bundles_per_iteration", 100, 100, new m() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznm.zzc());
            }
        });
        S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new m() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzq());
            }
        });
        T = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new m() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Long.valueOf(zznm.zzr());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        U = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzot.zzc());
            }
        });
        V = a("measurement.quality.checksum", bool, bool, null);
        W = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzny.zze());
            }
        });
        X = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzny.zzd());
            }
        });
        Y = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzny.zzf());
            }
        });
        Z = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzpi.zzc());
            }
        });
        f13405a0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzok.zzc());
            }
        });
        f13407b0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzon.zzc());
            }
        });
        f13409c0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzpf.zzd());
            }
        });
        f13411d0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzpl.zzc());
            }
        });
        f13413e0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zznv.zzd());
            }
        });
        f13415f0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzoe.zzd());
            }
        });
        f13417g0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzpc.zzc());
            }
        });
        f13419h0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new m() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Integer.valueOf((int) zznp.zzb());
            }
        });
        f13421i0 = a("measurement.client.click_identifier_control.dev", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzng.zzc());
            }
        });
        f13423j0 = a("measurement.service.click_identifier_control", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zznj.zzc());
            }
        });
        f13425k0 = a("measurement.service.store_null_safelist", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzns.zzd());
            }
        });
        f13427l0 = a("measurement.service.store_safelist", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzns.zze());
            }
        });
        f13429m0 = a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzl());
            }
        });
        f13431n0 = a("measurement.redaction.config_redacted_fields", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzf());
            }
        });
        f13433o0 = a("measurement.redaction.upload_redacted_fields", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzo());
            }
        });
        f13435p0 = a("measurement.redaction.upload_subdomain_override", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzp());
            }
        });
        f13437q0 = a("measurement.redaction.device_info", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzg());
            }
        });
        f13439r0 = a("measurement.redaction.user_id", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzq());
            }
        });
        f13441s0 = a("measurement.redaction.google_signals", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzk());
            }
        });
        f13443t0 = a("measurement.collection.enable_session_stitching_token.service", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzoz.zze());
            }
        });
        f13445u0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, new m() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzoz.zzd());
            }
        });
        f13447v0 = a("measurement.redaction.app_instance_id", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzd());
            }
        });
        f13449w0 = a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzj());
            }
        });
        f13451x0 = a("measurement.redaction.enhanced_uid", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzi());
            }
        });
        f13453y0 = a("measurement.redaction.e_tag", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzh());
            }
        });
        f13455z0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zze());
            }
        });
        A0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzm());
            }
        });
        B0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzow.zzn());
            }
        });
        C0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzob.zzd());
            }
        });
        D0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new m() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.m
            public final Object zza() {
                zzea zzeaVar = zzeb.f13408c;
                return Boolean.valueOf(zzoh.zzd());
            }
        });
    }

    @VisibleForTesting
    static zzea a(String str, Object obj, Object obj2, m mVar) {
        zzea zzeaVar = new zzea(str, obj, obj2, mVar, null);
        f13404a.add(zzeaVar);
        return zzeaVar;
    }

    public static Map c(Context context) {
        com.google.android.gms.internal.measurement.zzhe zza = com.google.android.gms.internal.measurement.zzhe.zza(context.getContentResolver(), zzhp.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzay
            @Override // java.lang.Runnable
            public final void run() {
                zzia.zzd();
            }
        });
        return zza == null ? Collections.emptyMap() : zza.zzc();
    }
}
