package com.basuritas.www.basuritas;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ReciclarFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ReciclarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReciclarFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ListView listView;
    private ArrayList<Tip> tips;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReciclarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReciclarFragment newInstance(String param1, String param2) {
        ReciclarFragment fragment = new ReciclarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public ReciclarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_reciclar, container, false);

        tips = new ArrayList<Tip>();
        tips.add(new Tip("¿Qué podemos reciclar?","Reciclar es darle una nueva vida a los envases, reduciendo el consumo de recursos y la degradación del planeta. Aquí  te contamos los materiales reciclables más comunes de nuestro día a día:"));
        tips.add(new Tip("Envases de plástico","Reducir su consumo, reutilizar y reciclar son las tres acciones básicas para reducir su impacto, ya que el plástico tarda alrededor de 700 años en degradarse. Por eso, es importante depositar en el contenedor amarillo las botellas de agua, de detergente, el bote de champú o las bolsas de patata."));
        tips.add(new Tip("Briks","También podemos reciclar el brik de leche o de zumo depositándolos al contenedor amarillo y así conseguir darles una segunda vida."));
        tips.add(new Tip("Latas","Este tipo de envase está siempre presente en nuestra cocina. ¿Quién no tiene una lata de refresco o de conservas en el frigorífico?  Las latas están compuestas de aluminio y se pueden reciclar un número ilimitado de veces. ¡Al contenedor amarillo!."));
        tips.add(new Tip("Envases de papel y cartón","Revistas, periódicos viejos, caja de cereales, de zapatos... todos deben ir al contenedor azul para ser reciclados y ayudar a reducir la sobreexplotación de los recursos naturales."));
        tips.add(new Tip("Vidrio","Este material se puede volver a reutilizar mediante un proceso de lavado de desechos o a través de su fundición y puede ser reciclado al 100% una cantidad indefinida de veces.  Para ello debemos separarlos del resto de materiales. ¡Al contenedor verde!"));
        tips.add(new Tip("Pilas y baterías","Podemos encontrarlas a diario en el mando de la tele, el ratón del ordenador o en la maquinilla de afeitar y nunca debemos tirarlas a la basura con el resto de residuos. Tienen componentes altamente contaminantes, por lo que es muy importante llevarlas a los contenedores de residuos peligrosos que tengamos más cerca de casa o al punto limpio."));
        tips.add(new Tip("Otros","Electrodomésticos, aparatos electrónicos, bombillas, aceites usados… también se puede reciclar en los puntos limpios."));

        listView = (ListView) fragmentView.findViewById((R.id.listView));
        TipsAdapter adapter = new TipsAdapter(container.getContext(),R.layout.tip, tips);
        listView.setAdapter(adapter);
        return fragmentView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            Log.e("ERROR  FRAGMENT", "HAY QUE SOLUCIONAR EL PROBLEMA");
            /*
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
                    */
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
