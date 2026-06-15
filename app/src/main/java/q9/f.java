package q9;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import n9.c0;
import n9.p;
import n9.s;
/* compiled from: RouteSelector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final n9.a f30168a;

    /* renamed from: b  reason: collision with root package name */
    private final d f30169b;

    /* renamed from: c  reason: collision with root package name */
    private final n9.e f30170c;

    /* renamed from: d  reason: collision with root package name */
    private final p f30171d;

    /* renamed from: f  reason: collision with root package name */
    private int f30173f;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f30172e = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f30174g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private final List<c0> f30175h = new ArrayList();

    /* compiled from: RouteSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c0> f30176a;

        /* renamed from: b  reason: collision with root package name */
        private int f30177b = 0;

        a(List<c0> list) {
            this.f30176a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f30176a);
        }

        public boolean b() {
            return this.f30177b < this.f30176a.size();
        }

        public c0 c() {
            if (b()) {
                List<c0> list = this.f30176a;
                int i10 = this.f30177b;
                this.f30177b = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public f(n9.a aVar, d dVar, n9.e eVar, p pVar) {
        this.f30168a = aVar;
        this.f30169b = dVar;
        this.f30170c = eVar;
        this.f30171d = pVar;
        h(aVar.l(), aVar.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean d() {
        return this.f30173f < this.f30172e.size();
    }

    private Proxy f() throws IOException {
        if (d()) {
            List<Proxy> list = this.f30172e;
            int i10 = this.f30173f;
            this.f30173f = i10 + 1;
            Proxy proxy = list.get(i10);
            g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f30168a.l().l() + "; exhausted proxy configurations: " + this.f30172e);
    }

    private void g(Proxy proxy) throws IOException {
        String l10;
        int w10;
        this.f30174g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                l10 = b(inetSocketAddress);
                w10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            l10 = this.f30168a.l().l();
            w10 = this.f30168a.l().w();
        }
        if (w10 >= 1 && w10 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f30174g.add(InetSocketAddress.createUnresolved(l10, w10));
                return;
            }
            this.f30171d.j(this.f30170c, l10);
            List<InetAddress> a10 = this.f30168a.c().a(l10);
            if (!a10.isEmpty()) {
                this.f30171d.i(this.f30170c, l10, a10);
                int size = a10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f30174g.add(new InetSocketAddress(a10.get(i10), w10));
                }
                return;
            }
            throw new UnknownHostException(this.f30168a.c() + " returned no addresses for " + l10);
        }
        throw new SocketException("No route to " + l10 + ":" + w10 + "; port is out of range");
    }

    private void h(s sVar, Proxy proxy) {
        if (proxy != null) {
            this.f30172e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f30168a.i().select(sVar.C());
            this.f30172e = (select == null || select.isEmpty()) ? o9.c.u(Proxy.NO_PROXY) : o9.c.t(select);
        }
        this.f30173f = 0;
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f30168a.i() != null) {
            this.f30168a.i().connectFailed(this.f30168a.l().C(), c0Var.b().address(), iOException);
        }
        this.f30169b.b(c0Var);
    }

    public boolean c() {
        return d() || !this.f30175h.isEmpty();
    }

    public a e() throws IOException {
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (d()) {
                Proxy f10 = f();
                int size = this.f30174g.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c0 c0Var = new c0(this.f30168a, f10, this.f30174g.get(i10));
                    if (this.f30169b.c(c0Var)) {
                        this.f30175h.add(c0Var);
                    } else {
                        arrayList.add(c0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f30175h);
                this.f30175h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
