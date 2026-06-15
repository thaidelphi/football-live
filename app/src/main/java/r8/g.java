package r8;

import com.google.android.gms.common.api.Api;
import i8.w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: FileTreeWalk.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g implements a9.f<File> {

    /* renamed from: a  reason: collision with root package name */
    private final File f30425a;

    /* renamed from: b  reason: collision with root package name */
    private final h f30426b;

    /* renamed from: c  reason: collision with root package name */
    private final t8.l<File, Boolean> f30427c;

    /* renamed from: d  reason: collision with root package name */
    private final t8.l<File, w> f30428d;

    /* renamed from: e  reason: collision with root package name */
    private final t8.p<File, IOException, w> f30429e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30430f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            kotlin.jvm.internal.n.f(rootDir, "rootDir");
        }
    }

    /* compiled from: FileTreeWalk.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private final class b extends j8.b<File> {

        /* renamed from: c  reason: collision with root package name */
        private final ArrayDeque<c> f30431c;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FileTreeWalk.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public final class a extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f30433b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f30434c;

            /* renamed from: d  reason: collision with root package name */
            private int f30435d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f30436e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f30437f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                kotlin.jvm.internal.n.f(rootDir, "rootDir");
                this.f30437f = bVar;
            }

            @Override // r8.g.c
            public File b() {
                if (!this.f30436e && this.f30434c == null) {
                    t8.l lVar = g.this.f30427c;
                    boolean z10 = false;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f30434c = listFiles;
                    if (listFiles == null) {
                        t8.p pVar = g.this.f30429e;
                        if (pVar != null) {
                            pVar.invoke(a(), new r8.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f30436e = true;
                    }
                }
                File[] fileArr = this.f30434c;
                if (fileArr != null) {
                    int i10 = this.f30435d;
                    kotlin.jvm.internal.n.c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f30434c;
                        kotlin.jvm.internal.n.c(fileArr2);
                        int i11 = this.f30435d;
                        this.f30435d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (this.f30433b) {
                    t8.l lVar2 = g.this.f30428d;
                    if (lVar2 != null) {
                        lVar2.invoke(a());
                    }
                    return null;
                }
                this.f30433b = true;
                return a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: r8.g$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        private final class C0349b extends c {

            /* renamed from: b  reason: collision with root package name */
            private boolean f30438b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f30439c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0349b(b bVar, File rootFile) {
                super(rootFile);
                kotlin.jvm.internal.n.f(rootFile, "rootFile");
                this.f30439c = bVar;
            }

            @Override // r8.g.c
            public File b() {
                if (this.f30438b) {
                    return null;
                }
                this.f30438b = true;
                return a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FileTreeWalk.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f30440b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f30441c;

            /* renamed from: d  reason: collision with root package name */
            private int f30442d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f30443e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                kotlin.jvm.internal.n.f(rootDir, "rootDir");
                this.f30443e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
                if (r0.length == 0) goto L32;
             */
            @Override // r8.g.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f30440b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    r8.g$b r0 = r10.f30443e
                    r8.g r0 = r8.g.this
                    t8.l r0 = r8.g.d(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f30440b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f30441c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f30442d
                    kotlin.jvm.internal.n.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    r8.g$b r0 = r10.f30443e
                    r8.g r0 = r8.g.this
                    t8.l r0 = r8.g.f(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f30441c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f30441c = r0
                    if (r0 != 0) goto L7b
                    r8.g$b r0 = r10.f30443e
                    r8.g r0 = r8.g.this
                    t8.p r0 = r8.g.e(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    r8.a r9 = new r8.a
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f30441c
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.n.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    r8.g$b r0 = r10.f30443e
                    r8.g r0 = r8.g.this
                    t8.l r0 = r8.g.f(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f30441c
                    kotlin.jvm.internal.n.c(r0)
                    int r1 = r10.f30442d
                    int r2 = r1 + 1
                    r10.f30442d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: r8.g.b.c.b():java.io.File");
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f30444a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f30444a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f30431c = arrayDeque;
            if (g.this.f30425a.isDirectory()) {
                arrayDeque.push(e(g.this.f30425a));
            } else if (g.this.f30425a.isFile()) {
                arrayDeque.push(new C0349b(this, g.this.f30425a));
            } else {
                b();
            }
        }

        private final a e(File file) {
            int i10 = d.f30444a[g.this.f30426b.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new a(this, file);
                }
                throw new i8.l();
            }
            return new c(this, file);
        }

        private final File f() {
            File b10;
            while (true) {
                c peek = this.f30431c.peek();
                if (peek == null) {
                    return null;
                }
                b10 = peek.b();
                if (b10 == null) {
                    this.f30431c.pop();
                } else if (kotlin.jvm.internal.n.a(b10, peek.a()) || !b10.isDirectory() || this.f30431c.size() >= g.this.f30430f) {
                    break;
                } else {
                    this.f30431c.push(e(b10));
                }
            }
            return b10;
        }

        @Override // j8.b
        protected void a() {
            File f10 = f();
            if (f10 != null) {
                c(f10);
            } else {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final File f30445a;

        public c(File root) {
            kotlin.jvm.internal.n.f(root, "root");
            this.f30445a = root;
        }

        public final File a() {
            return this.f30445a;
        }

        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g(File file, h hVar, t8.l<? super File, Boolean> lVar, t8.l<? super File, w> lVar2, t8.p<? super File, ? super IOException, w> pVar, int i10) {
        this.f30425a = file;
        this.f30426b = hVar;
        this.f30427c = lVar;
        this.f30428d = lVar2;
        this.f30429e = pVar;
        this.f30430f = i10;
    }

    @Override // a9.f
    public Iterator<File> iterator() {
        return new b();
    }

    /* synthetic */ g(File file, h hVar, t8.l lVar, t8.l lVar2, t8.p pVar, int i10, int i11, kotlin.jvm.internal.h hVar2) {
        this(file, (i11 & 2) != 0 ? h.TOP_DOWN : hVar, lVar, lVar2, pVar, (i11 & 32) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(File start, h direction) {
        this(start, direction, null, null, null, 0, 32, null);
        kotlin.jvm.internal.n.f(start, "start");
        kotlin.jvm.internal.n.f(direction, "direction");
    }
}
