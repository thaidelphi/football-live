package s1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
/* compiled from: AwesomeWarningDialog.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends s1.a<c> {

    /* renamed from: h  reason: collision with root package name */
    private Button f30611h;

    /* renamed from: i  reason: collision with root package name */
    private RelativeLayout f30612i;

    /* compiled from: AwesomeWarningDialog.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1.a f30613a;

        a(t1.a aVar) {
            this.f30613a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1.a aVar = this.f30613a;
            if (aVar != null) {
                aVar.a();
            }
            c.this.f();
        }
    }

    public c(Context context) {
        super(context);
        this.f30611h = (Button) c(g.f30624c);
        this.f30612i = (RelativeLayout) c(g.f30627f);
        int i10 = e.f30618c;
        h(i10);
        j(f.f30620a, e.f30616a);
        n(i10);
        g(true);
    }

    @Override // s1.a
    protected int e() {
        return h.f30632b;
    }

    public c n(int i10) {
        Button button = this.f30611h;
        if (button != null) {
            button.getBackground().setColorFilter(androidx.core.content.a.d(d(), i10), PorterDuff.Mode.SRC_IN);
        }
        return this;
    }

    public c o(String str) {
        Button button = this.f30611h;
        if (button != null) {
            button.setText(str);
            this.f30611h.setVisibility(0);
        }
        return this;
    }

    public c p(int i10) {
        Button button = this.f30611h;
        if (button != null) {
            button.setTextColor(androidx.core.content.a.d(d(), i10));
        }
        return this;
    }

    public c q(t1.a aVar) {
        this.f30611h.setOnClickListener(new a(aVar));
        return this;
    }
}
