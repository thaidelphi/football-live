package m6;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class i implements j6.g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f27785a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27786b = false;

    /* renamed from: c  reason: collision with root package name */
    private j6.c f27787c;

    /* renamed from: d  reason: collision with root package name */
    private final f f27788d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f27788d = fVar;
    }

    private void a() {
        if (!this.f27785a) {
            this.f27785a = true;
            return;
        }
        throw new j6.b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(j6.c cVar, boolean z10) {
        this.f27785a = false;
        this.f27787c = cVar;
        this.f27786b = z10;
    }

    @Override // j6.g
    public j6.g c(String str) throws IOException {
        a();
        this.f27788d.g(this.f27787c, str, this.f27786b);
        return this;
    }

    @Override // j6.g
    public j6.g e(boolean z10) throws IOException {
        a();
        this.f27788d.l(this.f27787c, z10, this.f27786b);
        return this;
    }
}
