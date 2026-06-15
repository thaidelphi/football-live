package y1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: GlideException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q extends Exception {

    /* renamed from: g  reason: collision with root package name */
    private static final StackTraceElement[] f33004g = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    private final List<Throwable> f33005a;

    /* renamed from: b  reason: collision with root package name */
    private w1.f f33006b;

    /* renamed from: c  reason: collision with root package name */
    private w1.a f33007c;

    /* renamed from: d  reason: collision with root package name */
    private Class<?> f33008d;

    /* renamed from: e  reason: collision with root package name */
    private String f33009e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f33010f;

    public q(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof q) {
            for (Throwable th2 : ((q) th).e()) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i10);
            if (th instanceof q) {
                ((q) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f33005a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f10.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f33009e);
        sb.append(this.f33008d != null ? ", " + this.f33008d : "");
        sb.append(this.f33007c != null ? ", " + this.f33007c : "");
        sb.append(this.f33006b != null ? ", " + this.f33006b : "");
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb.toString();
        }
        if (f10.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f10.size());
            sb.append(" root causes:");
        }
        for (Throwable th : f10) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(w1.f fVar, w1.a aVar) {
        j(fVar, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(w1.f fVar, w1.a aVar, Class<?> cls) {
        this.f33006b = fVar;
        this.f33007c = aVar;
        this.f33008d = cls;
    }

    public void k(Exception exc) {
        this.f33010f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List<Throwable> list) {
        this.f33009e = str;
        setStackTrace(f33004g);
        this.f33005a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlideException.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f33011a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f33012b = true;

        a(Appendable appendable) {
            this.f33011a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f33012b) {
                this.f33012b = false;
                this.f33011a.append("  ");
            }
            this.f33012b = c10 == '\n';
            this.f33011a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f33012b) {
                this.f33012b = false;
                this.f33011a.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f33012b = z10;
            this.f33011a.append(a10, i10, i11);
            return this;
        }
    }
}
