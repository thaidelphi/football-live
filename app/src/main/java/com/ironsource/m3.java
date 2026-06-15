package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class m3 {

    /* renamed from: a  reason: collision with root package name */
    public static final m3 f18382a = new m3();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final IronSource.AD_UNIT f18383a;

        public a(IronSource.AD_UNIT value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f18383a = value;
        }

        public static /* synthetic */ a a(a aVar, IronSource.AD_UNIT ad_unit, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ad_unit = aVar.f18383a;
            }
            return aVar.a(ad_unit);
        }

        private final IronSource.AD_UNIT a() {
            return this.f18383a;
        }

        public final a a(IronSource.AD_UNIT value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new a(value);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(vt.b(this.f18383a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f18383a == ((a) obj).f18383a;
        }

        public int hashCode() {
            return this.f18383a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.f18383a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18384a;

        public b(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f18384a = value;
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f18384a;
            }
            return bVar.a(str);
        }

        private final String a() {
            return this.f18384a;
        }

        public final b a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new b(value);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f18384a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f18384a, ((b) obj).f18384a);
        }

        public int hashCode() {
            return this.f18384a.hashCode();
        }

        public String toString() {
            return "AdIdentifier(value=" + this.f18384a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final AdSize f18385a;

        public c(AdSize size) {
            kotlin.jvm.internal.n.f(size, "size");
            this.f18385a = size;
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            int i10;
            kotlin.jvm.internal.n.f(bundle, "bundle");
            String sizeDescription = this.f18385a.getSizeDescription();
            int hashCode = sizeDescription.hashCode();
            if (hashCode == -96588539) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.l.f18876g)) {
                    i10 = 3;
                }
                i10 = 0;
            } else if (hashCode == 72205083) {
                if (sizeDescription.equals(com.ironsource.mediationsdk.l.f18871b)) {
                    i10 = 2;
                }
                i10 = 0;
            } else if (hashCode != 446888797) {
                if (hashCode == 1951953708 && sizeDescription.equals("BANNER")) {
                    i10 = 1;
                }
                i10 = 0;
            } else {
                if (sizeDescription.equals(com.ironsource.mediationsdk.l.f18873d)) {
                    i10 = 4;
                }
                i10 = 0;
            }
            bundle.put(com.ironsource.mediationsdk.l.f18877h, Integer.valueOf(i10));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18386a;

        public d(String auctionId) {
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            this.f18386a = auctionId;
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f18386a;
            }
            return dVar.a(str);
        }

        private final String a() {
            return this.f18386a;
        }

        public final d a(String auctionId) {
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            return new d(auctionId);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("auctionId", this.f18386a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.n.a(this.f18386a, ((d) obj).f18386a);
        }

        public int hashCode() {
            return this.f18386a.hashCode();
        }

        public String toString() {
            return "AuctionId(auctionId=" + this.f18386a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class e implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18387a;

        public e(int i10) {
            this.f18387a = i10;
        }

        private final int a() {
            return this.f18387a;
        }

        public static /* synthetic */ e a(e eVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = eVar.f18387a;
            }
            return eVar.a(i10);
        }

        public final e a(int i10) {
            return new e(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f18387a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f18387a == ((e) obj).f18387a;
        }

        public int hashCode() {
            return this.f18387a;
        }

        public String toString() {
            return "DemandOnly(value=" + this.f18387a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class f implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final long f18388a;

        public f(long j10) {
            this.f18388a = j10;
        }

        private final long a() {
            return this.f18388a;
        }

        public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f18388a;
            }
            return fVar.a(j10);
        }

        public final f a(long j10) {
            return new f(j10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f18388a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f18388a == ((f) obj).f18388a;
        }

        public int hashCode() {
            return androidx.privacysandbox.ads.adservices.topics.d.a(this.f18388a);
        }

        public String toString() {
            return "Duration(duration=" + this.f18388a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class g implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18389a;

        public g(String dynamicSourceId) {
            kotlin.jvm.internal.n.f(dynamicSourceId, "dynamicSourceId");
            this.f18389a = dynamicSourceId;
        }

        public static /* synthetic */ g a(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f18389a;
            }
            return gVar.a(str);
        }

        private final String a() {
            return this.f18389a;
        }

        public final g a(String dynamicSourceId) {
            kotlin.jvm.internal.n.f(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f18389a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.n.a(this.f18389a, ((g) obj).f18389a);
        }

        public int hashCode() {
            return this.f18389a.hashCode();
        }

        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f18389a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class h implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18390a;

        public h(String sourceId) {
            kotlin.jvm.internal.n.f(sourceId, "sourceId");
            this.f18390a = sourceId;
        }

        public static /* synthetic */ h a(h hVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.f18390a;
            }
            return hVar.a(str);
        }

        private final String a() {
            return this.f18390a;
        }

        public final h a(String sourceId) {
            kotlin.jvm.internal.n.f(sourceId, "sourceId");
            return new h(sourceId);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f18390a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.n.a(this.f18390a, ((h) obj).f18390a);
        }

        public int hashCode() {
            return this.f18390a.hashCode();
        }

        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f18390a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class i implements n3 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f18391a = new i();

        private i() {
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class j implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18392a;

        public j(int i10) {
            this.f18392a = i10;
        }

        private final int a() {
            return this.f18392a;
        }

        public static /* synthetic */ j a(j jVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = jVar.f18392a;
            }
            return jVar.a(i10);
        }

        public final j a(int i10) {
            return new j(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.f18392a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f18392a == ((j) obj).f18392a;
        }

        public int hashCode() {
            return this.f18392a;
        }

        public String toString() {
            return "ErrorCode(code=" + this.f18392a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class k implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18393a;

        public k(String str) {
            this.f18393a = str;
        }

        public static /* synthetic */ k a(k kVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kVar.f18393a;
            }
            return kVar.a(str);
        }

        private final String a() {
            return this.f18393a;
        }

        public final k a(String str) {
            return new k(str);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            String str = this.f18393a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f18393a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && kotlin.jvm.internal.n.a(this.f18393a, ((k) obj).f18393a);
        }

        public int hashCode() {
            String str = this.f18393a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ErrorReason(reason=" + this.f18393a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class l implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18394a;

        public l(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f18394a = value;
        }

        public static /* synthetic */ l a(l lVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = lVar.f18394a;
            }
            return lVar.a(str);
        }

        private final String a() {
            return this.f18394a;
        }

        public final l a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new l(value);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f18394a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && kotlin.jvm.internal.n.a(this.f18394a, ((l) obj).f18394a);
        }

        public int hashCode() {
            return this.f18394a.hashCode();
        }

        public String toString() {
            return "Ext1(value=" + this.f18394a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class m implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f18395a;

        public m(JSONObject jSONObject) {
            this.f18395a = jSONObject;
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = mVar.f18395a;
            }
            return mVar.a(jSONObject);
        }

        private final JSONObject a() {
            return this.f18395a;
        }

        public final m a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            JSONObject jSONObject = this.f18395a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && kotlin.jvm.internal.n.a(this.f18395a, ((m) obj).f18395a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f18395a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.f18395a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class n implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18396a;

        public n(int i10) {
            this.f18396a = i10;
        }

        private final int a() {
            return this.f18396a;
        }

        public static /* synthetic */ n a(n nVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = nVar.f18396a;
            }
            return nVar.a(i10);
        }

        public final n a(int i10) {
            return new n(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f18396a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f18396a == ((n) obj).f18396a;
        }

        public int hashCode() {
            return this.f18396a;
        }

        public String toString() {
            return "InstanceType(instanceType=" + this.f18396a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class o implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18397a;

        public o(int i10) {
            this.f18397a = i10;
        }

        private final int a() {
            return this.f18397a;
        }

        public static /* synthetic */ o a(o oVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oVar.f18397a;
            }
            return oVar.a(i10);
        }

        public final o a(int i10) {
            return new o(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f18397a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f18397a == ((o) obj).f18397a;
        }

        public int hashCode() {
            return this.f18397a;
        }

        public String toString() {
            return "MultipleAdObjects(value=" + this.f18397a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class p implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18398a;

        public p(int i10) {
            this.f18398a = i10;
        }

        private final int a() {
            return this.f18398a;
        }

        public static /* synthetic */ p a(p pVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pVar.f18398a;
            }
            return pVar.a(i10);
        }

        public final p a(int i10) {
            return new p(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f18398a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f18398a == ((p) obj).f18398a;
        }

        public int hashCode() {
            return this.f18398a;
        }

        public String toString() {
            return "OneFlow(value=" + this.f18398a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class q implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18399a;

        public q(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f18399a = value;
        }

        public static /* synthetic */ q a(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.f18399a;
            }
            return qVar.a(str);
        }

        private final String a() {
            return this.f18399a;
        }

        public final q a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new q(value);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("placement", this.f18399a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.n.a(this.f18399a, ((q) obj).f18399a);
        }

        public int hashCode() {
            return this.f18399a.hashCode();
        }

        public String toString() {
            return "Placement(value=" + this.f18399a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class r implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18400a;

        public r(int i10) {
            this.f18400a = i10;
        }

        private final int a() {
            return this.f18400a;
        }

        public static /* synthetic */ r a(r rVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = rVar.f18400a;
            }
            return rVar.a(i10);
        }

        public final r a(int i10) {
            return new r(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f18400a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f18400a == ((r) obj).f18400a;
        }

        public int hashCode() {
            return this.f18400a;
        }

        public String toString() {
            return "Programmatic(programmatic=" + this.f18400a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class s implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18401a;

        public s(String sourceName) {
            kotlin.jvm.internal.n.f(sourceName, "sourceName");
            this.f18401a = sourceName;
        }

        public static /* synthetic */ s a(s sVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sVar.f18401a;
            }
            return sVar.a(str);
        }

        private final String a() {
            return this.f18401a;
        }

        public final s a(String sourceName) {
            kotlin.jvm.internal.n.f(sourceName, "sourceName");
            return new s(sourceName);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f18401a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.n.a(this.f18401a, ((s) obj).f18401a);
        }

        public int hashCode() {
            return this.f18401a.hashCode();
        }

        public String toString() {
            return "Provider(sourceName=" + this.f18401a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class t implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18402a;

        public t(int i10) {
            this.f18402a = i10;
        }

        private final int a() {
            return this.f18402a;
        }

        public static /* synthetic */ t a(t tVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tVar.f18402a;
            }
            return tVar.a(i10);
        }

        public final t a(int i10) {
            return new t(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f18402a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f18402a == ((t) obj).f18402a;
        }

        public int hashCode() {
            return this.f18402a;
        }

        public String toString() {
            return "RewardAmount(value=" + this.f18402a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class u implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18403a;

        public u(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f18403a = value;
        }

        public static /* synthetic */ u a(u uVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uVar.f18403a;
            }
            return uVar.a(str);
        }

        private final String a() {
            return this.f18403a;
        }

        public final u a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new u(value);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f18403a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && kotlin.jvm.internal.n.a(this.f18403a, ((u) obj).f18403a);
        }

        public int hashCode() {
            return this.f18403a.hashCode();
        }

        public String toString() {
            return "RewardName(value=" + this.f18403a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class v implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18404a;

        public v(String version) {
            kotlin.jvm.internal.n.f(version, "version");
            this.f18404a = version;
        }

        public static /* synthetic */ v a(v vVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = vVar.f18404a;
            }
            return vVar.a(str);
        }

        private final String a() {
            return this.f18404a;
        }

        public final v a(String version) {
            kotlin.jvm.internal.n.f(version, "version");
            return new v(version);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f18404a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && kotlin.jvm.internal.n.a(this.f18404a, ((v) obj).f18404a);
        }

        public int hashCode() {
            return this.f18404a.hashCode();
        }

        public String toString() {
            return "SdkVersion(version=" + this.f18404a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class w implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final int f18405a;

        public w(int i10) {
            this.f18405a = i10;
        }

        private final int a() {
            return this.f18405a;
        }

        public static /* synthetic */ w a(w wVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = wVar.f18405a;
            }
            return wVar.a(i10);
        }

        public final w a(int i10) {
            return new w(i10);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f18405a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f18405a == ((w) obj).f18405a;
        }

        public int hashCode() {
            return this.f18405a;
        }

        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f18405a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class x implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18406a;

        public x(String subProviderId) {
            kotlin.jvm.internal.n.f(subProviderId, "subProviderId");
            this.f18406a = subProviderId;
        }

        public static /* synthetic */ x a(x xVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = xVar.f18406a;
            }
            return xVar.a(str);
        }

        private final String a() {
            return this.f18406a;
        }

        public final x a(String subProviderId) {
            kotlin.jvm.internal.n.f(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("spId", this.f18406a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && kotlin.jvm.internal.n.a(this.f18406a, ((x) obj).f18406a);
        }

        public int hashCode() {
            return this.f18406a.hashCode();
        }

        public String toString() {
            return "SubProviderId(subProviderId=" + this.f18406a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class y implements n3 {

        /* renamed from: a  reason: collision with root package name */
        private final String f18407a;

        public y(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f18407a = value;
        }

        public static /* synthetic */ y a(y yVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = yVar.f18407a;
            }
            return yVar.a(str);
        }

        private final String a() {
            return this.f18407a;
        }

        public final y a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new y(value);
        }

        @Override // com.ironsource.n3
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f18407a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && kotlin.jvm.internal.n.a(this.f18407a, ((y) obj).f18407a);
        }

        public int hashCode() {
            return this.f18407a.hashCode();
        }

        public String toString() {
            return "TransId(value=" + this.f18407a + ')';
        }
    }

    private m3() {
    }
}
