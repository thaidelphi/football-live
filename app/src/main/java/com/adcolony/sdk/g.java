package com.adcolony.sdk;

import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5994e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, String> f5995f;

    /* renamed from: a  reason: collision with root package name */
    private final String f5996a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5997b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5998c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5999d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final Map<String, String> a() {
            return g.f5995f;
        }

        public final void a(Map<String, String> map) {
            synchronized (a()) {
                g.f5994e.a().putAll(map);
                i8.w wVar = i8.w.f26638a;
            }
        }

        public final g a(String str, String str2) {
            g gVar;
            if (str == null || str2 == null) {
                return null;
            }
            synchronized (a()) {
                a aVar = g.f5994e;
                if (!aVar.a().containsKey(str)) {
                    str = RewardedVideo.VIDEO_MODE_DEFAULT;
                }
                if (!aVar.a().containsKey(str2)) {
                    str2 = RewardedVideo.VIDEO_MODE_DEFAULT;
                }
                gVar = new g(str, str2, aVar.a().get(str), aVar.a().get(str2));
            }
            return gVar;
        }
    }

    static {
        Map<String, String> i10;
        i10 = j8.j0.i(i8.s.a(RewardedVideo.VIDEO_MODE_DEFAULT, "truefalse"), i8.s.a("la-req-01", "\"iphoneos\"ipados\"cell\"tablet\"{\"carrier_name\":\",\"data_path\":\",\"device_api\":,\"screen_width\":,\"screen_height\":,\"display_dpi\":,\"device_type\":\"phone\",\"locale_language_code\":\",\"ln\":\",\"locale_country_code\":\",\"locale\":\",\"mac_address\":\"\",\"manufacturer\":\",\"device_brand\":\",\"media_path\":\",\"temp_storage_path\":\",\"memory_class\":,\"memory_used_mb\":,\"model\":\",\"device_model\":\",\"sdk_type\":\"android_native\",\"sdk_version\":\"4.\",\"network_type\":\"wifi\",\"os_version\":\",\"os_name\":\"android\",\"platform\":\"android\",\"arch\":\",\"user_id\":\"\",\"app_id\":\",\"app_bundle_name\":\",\"app_bundle_version\":\",\"battery_level\":1,\"cell_service_country_code\":\",\"timezone_ietf\":\",\"timezone_gmt_m\":,\"timezone_dst_m\":,\"controller_version\":\"3.\",\"current_orientation\":0,\"cleartext_permitted\":true,\"density\":,\"dark_mode\":false,\"available_stores\":[],\"advertiser_id\":\",\"limit_tracking\":false,\"adc_alt_id\":\"}"), i8.s.a("la-res-01", "{\"controller\":{\"url\":\"https://adc-ad-assets.adtilt.com/launch/__controllers__/4.0.0/controller.js\",\"sha1\":,\"version\":\"3.\"},\"libraries\":[],\"item\":0,\"logging\":{\"log_private\":false,\"send_level\":1,\"enable_crash_reporting\":false,\"print_level\":3,\"report_interval_ms\":5000},\"metadata\":{\"controller_heartbeat_interval\":300000,\"controller_heartbeat_timeout\":15000,\"ad_request_timeout\":20000,\"iab_url\":\"https://adc-ad-assets.adtilt.com/launch/__libs__/omsdk/omsdk-v1.js\",\"odt_config\":{\"version\":,\"streams\":[{\"stream\":\"events\",\"request_types\":[\"start\",\"html5_interaction\",\"in_video_engagement\",\"download\",\"info\",\"viewable_impression\",\"complete\",\"skip\",\"continue\",\"midpoint\",\"first_quartile\",\"third_quartile\",\"reward_v4vc\"configure\"session_start\",\"session_end\",\"session_resume\",\"session_pause\"]\"table_name\"max_rows\": GROUP BY ]},\"calculate_odt_timeout\":500,\"async_odt_query\":false},\"status\":\"success\",\"pie\":\"}"));
        f5995f = i10;
    }

    public g(String str, String str2, String str3, String str4) {
        this.f5996a = str;
        this.f5997b = str2;
        this.f5998c = str3;
        this.f5999d = str4;
    }

    public static final g a(String str, String str2) {
        return f5994e.a(str, str2);
    }

    public static final void a(Map<String, String> map) {
        f5994e.a(map);
    }

    public final String b() {
        return this.f5996a;
    }

    public final String c() {
        return this.f5997b;
    }

    public final byte[] a(String str) throws UnsupportedEncodingException {
        return a(str.getBytes(h.f6025a));
    }

    public final String b(byte[] bArr) throws DataFormatException, UnsupportedEncodingException, IllegalArgumentException {
        return b(bArr, this.f5999d);
    }

    private final String b(byte[] bArr, String str) throws DataFormatException, UnsupportedEncodingException, IllegalArgumentException {
        Inflater inflater = new Inflater();
        try {
            inflater.setInput(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
                if (inflater.needsDictionary()) {
                    Charset charset = h.f6025a;
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    inflater.setDictionary(str.getBytes(charset));
                }
            }
            String str2 = new String(byteArrayOutputStream.toByteArray(), h.f6025a);
            r8.c.a(byteArrayOutputStream, null);
            return str2;
        } finally {
            inflater.end();
        }
    }

    public final byte[] a(byte[] bArr) throws UnsupportedEncodingException {
        return a(bArr, this.f5998c);
    }

    private final byte[] a(byte[] bArr, String str) throws UnsupportedEncodingException {
        Deflater deflater = new Deflater();
        try {
            Charset charset = h.f6025a;
            if (str != null) {
                deflater.setDictionary(str.getBytes(charset));
                deflater.setInput(bArr);
                deflater.finish();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                while (!deflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                r8.c.a(byteArrayOutputStream, null);
                return byteArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } finally {
            deflater.end();
        }
    }
}
