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
 * {@link ReutilizarFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ReutilizarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReutilizarFragment extends Fragment {
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
     * @return A new instance of fragment ReutilizarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReutilizarFragment newInstance(String param1, String param2) {
        ReutilizarFragment fragment = new ReutilizarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public ReutilizarFragment() {
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
        View fragmentView = inflater.inflate(R.layout.fragment_reutilizar, container, false);

        tips = new ArrayList<Tip>();
        tips.add(new Tip("Reutilizar","Empleando repetidamente o de diversas formas distintos productos consumibles.\n" +
                "No debe descartarse aquello que puede ser usado otra vez ya que cuantos más objetos reutilicemos, menos basura produciremos y menos recursos agotables tendremos que \"gastar\".\n" +
                "\n" +
                "    Compra líquidos en botellas de vidrio retornables.\n" +
                "\n" +
                "    Utiliza el papel por las dos caras.\n" +
                "\n" +
                "    Regala la ropa que te ha quedado pequeña o que ya no usas."));
        tips.add(new Tip("12 creativas maneras de reusar tu basura en casa","1. Utiliza los corchos del vino como pequeñas macetas o como llaveros que flotan (por si vas a la playa).\n" +
                "\n" +
                "2. Haz un comedero de pájaros con 2 botellas de plástico.\n" +
                "\n" +
                "3. Coloca un refractario abierto con granos de café usados para neutralizar el olor de tu refrigerador u auto.\n" +
                "\n" +
                "4. Coloca un anillo de granos de café usados alrededor de tus plantes de jardín para ahuyentar insectos.\n" +
                "\n" +
                "5. Guarda las bolsitas de té en tu refrigerador después de usarlas y colócalas sobre tus ojos en la mañana para reducir la inflamación.\n" +
                "\n" +
                "6. Utiliza todos tus frascos de plástico para guardar cosas.\n" +
                "\n" +
                "7. Los calcetines viejos o rotos son material perfecto para trapos de cocina.\n" +
                "\n" +
                "8. Utiliza cáscaras de plátano para sacar brillo a tus zapatos. Embarra el interior de la cáscara y luego talla con un trapo suave.\n" +
                "\n" +
                "9. Guarda los limones ya exprimidor en tu congelador y luego úsalos en agua fresca para beber o ráyalos para dar sabor a tu comida.\n" +
                "\n" +
                "10. No tires el migajón del pan. Guárdalo y deja que seque para alimentar a los pájaros.\n" +
                "\n" +
                "11. Añade un pedazo de cáscara de naranja al azúcar morena para asegurarte de que permanezca suave.\n" +
                "\n" +
                "12. Utiliza los cartones de huevo para plantar semillas; ya que el papel se bio-degradará puedes tirarlo directamente en la tierra después de que tus semillas hayan germinado."));
        tips.add(new Tip("5 atractivas formas de reutilizar tu basura que harán fluir tu imaginación","Existe una famosa frase  que dice “La basura de unos es el tesoro de otros“. ¡Pues tu basura puede convertirse también en tu propio tesoro! En vez de contribuir al mundo con más y más basura a diario, puedes reutilizar algunas de las cosas que usualmente arrojas al basurero para hacer ingeniosos proyectos que darán un toque ecológico a tu hogar sin perder su atractivo chic.  "));
        tips.add(new Tip("1. Regador"," Usa un galón plástico de leche o agua para regar tus plantas sin la necesidad de que estés todos los días de pie con regando con la manguera. Haz unos orificios en el fondo del recipiente y entiérralo junto a tus plantas para una irrigación lenta."));
        tips.add(new Tip("2. Gel de sílica","Esos molestos paquetes que vienen dentro de las cajas de tus zapatos nuevos o bolsos no son completamente inútiles como pensabas. Puedes aprovecharlos para diversas cosas como: mantener tus fotografías y documentos libres de humedad al igual que los lentes de tus cámaras"));
        tips.add(new Tip("3. Corchos","Los corchos de esos vinos que disfrutaste el fin de semana son bastante útiles. Puedes hacer con ellos tantas cosas, que sería casi imposible nombrarlas todas en un post. Pero para empezar, puedes hacer llaveros que flota en el agua, posa vasos, obras artísticas para decorar tu pared, puedes plantar pequeñas plantas suculentas, hacer una linda casa para pájaros, etc."));
        tips.add(new Tip("4. Comedero para aves","Si disfrutas el canto de los pájaros por la mañana o por la tarde y te gusta que estos coloridos animalitos visiten tu jardín, puedes hacer comederos para ellos con botellas de plástico y cucharas de palo o con botellas de vidrio. Depende de tu imaginación la apariencia que vayan a tener."));
        tips.add(new Tip("5. Plantas libres de invasores","Mantén tus plantas protegidas de las hormigas y babosas al verter los restos de tus granos de café usados alrededor de ellas."));
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
