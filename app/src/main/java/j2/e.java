package j2;
/* compiled from: GifDrawableResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends h2.b<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // y1.v
    public void a() {
        ((c) this.f26185a).stop();
        ((c) this.f26185a).k();
    }

    @Override // y1.v
    public Class<c> b() {
        return c.class;
    }

    @Override // y1.v
    public int getSize() {
        return ((c) this.f26185a).i();
    }

    @Override // h2.b, y1.r
    public void initialize() {
        ((c) this.f26185a).e().prepareToDraw();
    }
}
