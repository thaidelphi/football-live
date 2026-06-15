package q1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
/* compiled from: AdapterHome.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends RecyclerView.h<c> {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<p1.a> f30032a;

    /* renamed from: b  reason: collision with root package name */
    Context f30033b;

    /* renamed from: c  reason: collision with root package name */
    private b f30034c;

    /* renamed from: d  reason: collision with root package name */
    private int f30035d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHome.java */
    /* renamed from: q1.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class View$OnClickListenerC0343a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p1.a f30036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30037b;

        View$OnClickListenerC0343a(p1.a aVar, int i10) {
            this.f30036a = aVar;
            this.f30037b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f30034c != null) {
                a.this.f30034c.a(view, this.f30036a, this.f30037b);
            }
        }
    }

    /* compiled from: AdapterHome.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(View view, p1.a aVar, int i10);
    }

    /* compiled from: AdapterHome.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends RecyclerView.c0 {

        /* renamed from: a  reason: collision with root package name */
        ShapeableImageView f30039a;

        /* renamed from: b  reason: collision with root package name */
        TextView f30040b;

        /* renamed from: c  reason: collision with root package name */
        RelativeLayout f30041c;

        public c(View view) {
            super(view);
            this.f30039a = (ShapeableImageView) view.findViewById(2131361898);
            this.f30040b = (TextView) view.findViewById(2131361958);
            this.f30041c = (RelativeLayout) view.findViewById(2131362378);
        }
    }

    public a(ArrayList<p1.a> arrayList, Context context) {
        this.f30032a = new ArrayList<>();
        this.f30032a = arrayList;
        this.f30033b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(c cVar, @SuppressLint({"RecyclerView"}) int i10) {
        p1.a aVar = this.f30032a.get(i10);
        aVar.b();
        TextView textView = cVar.f30040b;
        textView.setText("" + aVar.b());
        cVar.f30040b.setSelected(true);
        if (!aVar.d().isEmpty()) {
            com.bumptech.glide.b.u(cVar.f30039a).r(aVar.d()).i(2131231168).T(2131231184).s0(cVar.f30039a);
        } else {
            cVar.f30040b.setTextSize(30.0f);
            cVar.f30039a.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = cVar.f30040b.getLayoutParams();
            layoutParams.height = IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED;
            cVar.f30040b.setLayoutParams(layoutParams);
        }
        cVar.f30041c.setOnClickListener(new View$OnClickListenerC0343a(aVar, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(this.f30033b).inflate(2131558572, viewGroup, false));
    }

    public void d() {
        this.f30032a = new ArrayList<>();
        notifyDataSetChanged();
    }

    public void e(b bVar) {
        this.f30034c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f30032a.size();
    }
}
