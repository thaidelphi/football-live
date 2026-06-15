package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface j1 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements j1 {

        /* renamed from: c  reason: collision with root package name */
        public static final C0223a f17886c = new C0223a(null);

        /* renamed from: a  reason: collision with root package name */
        private final String f17887a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f17888b;

        /* renamed from: com.ironsource.j1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class C0223a {
            private C0223a() {
            }

            public /* synthetic */ C0223a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final a a(String str) {
                return new a(str);
            }
        }

        public a() {
            this(null, 1, null);
        }

        public a(String str) {
            this.f17887a = str;
        }

        public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.h hVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f17887a;
            }
            return aVar.a(str);
        }

        public final a a(String str) {
            return new a(str);
        }

        @Override // com.ironsource.j1
        public boolean a() {
            return this.f17888b;
        }

        public final String b() {
            return this.f17887a;
        }

        public final String c() {
            return this.f17887a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f17887a, ((a) obj).f17887a);
        }

        public int hashCode() {
            String str = this.f17887a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NotReady(reason=" + this.f17887a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements j1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17889a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final boolean f17890b = true;

        private b() {
        }

        @Override // com.ironsource.j1
        public boolean a() {
            return f17890b;
        }
    }

    boolean a();
}
