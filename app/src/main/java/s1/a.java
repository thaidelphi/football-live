package s1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import s1.a;
/* compiled from: AwesomeDialogBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a<T extends a> {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f30596a;

    /* renamed from: b  reason: collision with root package name */
    private View f30597b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f30598c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f30599d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f30600e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f30601f;

    /* renamed from: g  reason: collision with root package name */
    private Context f30602g;

    public a(Context context) {
        a(new c.a(context));
        i(context);
    }

    public static Drawable b(Context context, int i10, int i11) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = context.getDrawable(i10);
        } else {
            drawable = context.getResources().getDrawable(i10);
        }
        if (drawable != null) {
            drawable.setColorFilter(androidx.core.content.a.d(context, i11), PorterDuff.Mode.SRC_IN);
        }
        return drawable;
    }

    public void a(c.a aVar) {
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(e(), (ViewGroup) null);
        this.f30597b = inflate;
        androidx.appcompat.app.c create = aVar.setView(inflate).create();
        this.f30596a = create;
        if (create.getWindow() != null) {
            this.f30596a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f30596a.getWindow().requestFeature(1);
        }
        this.f30598c = (ImageView) c(g.f30628g);
        this.f30599d = (TextView) c(g.f30630i);
        this.f30600e = (TextView) c(g.f30629h);
        this.f30601f = (RelativeLayout) c(g.f30626e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <ViewClass extends View> ViewClass c(int i10) {
        return (ViewClass) this.f30597b.findViewById(i10);
    }

    public Context d() {
        return this.f30602g;
    }

    protected abstract int e();

    public Dialog f() {
        try {
            this.f30596a.dismiss();
        } catch (Exception unused) {
            Log.d("[AwSDialog : dismiss]", " Erro ao remover diálogo (%s)");
        }
        this.f30596a.dismiss();
        return this.f30596a;
    }

    public T g(boolean z10) {
        this.f30596a.setCancelable(z10);
        return this;
    }

    public T h(int i10) {
        RelativeLayout relativeLayout = this.f30601f;
        if (relativeLayout != null) {
            relativeLayout.getBackground().setColorFilter(androidx.core.content.a.d(d(), i10), PorterDuff.Mode.SRC_IN);
        }
        return this;
    }

    public void i(Context context) {
        this.f30602g = context;
    }

    public T j(int i10, int i11) {
        if (this.f30598c != null) {
            this.f30598c.startAnimation(AnimationUtils.loadAnimation(d(), d.f30615a));
            this.f30598c.setImageDrawable(b(d(), i10, i11));
        }
        return this;
    }

    public T k(CharSequence charSequence) {
        TextView textView = this.f30600e;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return this;
    }

    public T l(CharSequence charSequence) {
        TextView textView = this.f30599d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return this;
    }

    public Dialog m() {
        try {
            Context context = this.f30602g;
            if (context instanceof Activity) {
                if (!((Activity) context).isFinishing()) {
                    this.f30596a.show();
                }
            } else {
                this.f30596a.show();
            }
        } catch (Exception unused) {
            Log.e("[AwSDialog:showAlert]", "Erro ao exibir alert");
        }
        return this.f30596a;
    }
}
