package s1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
/* compiled from: AwesomeSuccessDialog.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends s1.a<b> {

    /* renamed from: h  reason: collision with root package name */
    private Button f30603h;

    /* renamed from: i  reason: collision with root package name */
    private Button f30604i;

    /* renamed from: j  reason: collision with root package name */
    private Button f30605j;

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout f30606k;

    /* compiled from: AwesomeSuccessDialog.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1.a f30607a;

        a(t1.a aVar) {
            this.f30607a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1.a aVar = this.f30607a;
            if (aVar != null) {
                aVar.a();
            }
            b.this.f();
        }
    }

    /* compiled from: AwesomeSuccessDialog.java */
    /* renamed from: s1.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class View$OnClickListenerC0350b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1.a f30609a;

        View$OnClickListenerC0350b(t1.a aVar) {
            this.f30609a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1.a aVar = this.f30609a;
            if (aVar != null) {
                aVar.a();
            }
            b.this.f();
        }
    }

    public b(Context context) {
        super(context);
        this.f30603h = (Button) c(g.f30625d);
        this.f30604i = (Button) c(g.f30623b);
        this.f30605j = (Button) c(g.f30622a);
        this.f30606k = (RelativeLayout) c(g.f30627f);
        int i10 = e.f30617b;
        h(i10);
        j(f.f30621b, e.f30619d);
        r(i10);
        v(i10);
        n(i10);
    }

    @Override // s1.a
    protected int e() {
        return h.f30631a;
    }

    public b n(int i10) {
        Button button = this.f30605j;
        if (button != null) {
            button.getBackground().setColorFilter(androidx.core.content.a.d(d(), i10), PorterDuff.Mode.SRC_IN);
        }
        return this;
    }

    public b o(t1.a aVar) {
        this.f30604i.setOnClickListener(new View$OnClickListenerC0350b(aVar));
        return this;
    }

    public b p(String str) {
        Button button = this.f30604i;
        if (button != null) {
            button.setText(str);
            this.f30604i.setVisibility(0);
        }
        return this;
    }

    public b q(int i10) {
        Button button = this.f30604i;
        if (button != null) {
            button.setTextColor(androidx.core.content.a.d(d(), i10));
        }
        return this;
    }

    public b r(int i10) {
        Button button = this.f30604i;
        if (button != null) {
            button.getBackground().setColorFilter(androidx.core.content.a.d(d(), i10), PorterDuff.Mode.SRC_IN);
        }
        return this;
    }

    public b s(t1.a aVar) {
        this.f30603h.setOnClickListener(new a(aVar));
        return this;
    }

    public b t(String str) {
        Button button = this.f30603h;
        if (button != null) {
            button.setText(str);
            this.f30603h.setVisibility(0);
        }
        return this;
    }

    public b u(int i10) {
        Button button = this.f30603h;
        if (button != null) {
            button.setTextColor(androidx.core.content.a.d(d(), i10));
        }
        return this;
    }

    public b v(int i10) {
        Button button = this.f30603h;
        if (button != null) {
            button.getBackground().setColorFilter(androidx.core.content.a.d(d(), i10), PorterDuff.Mode.SRC_IN);
        }
        return this;
    }
}
