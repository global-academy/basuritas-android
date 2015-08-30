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
 * {@link ReducirFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ReducirFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReducirFragment extends Fragment {
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
     * @return A new instance of fragment ReducirFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReducirFragment newInstance(String param1, String param2) {
        ReducirFragment fragment = new ReducirFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public ReducirFragment() {
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
        View fragmentView = inflater.inflate(R.layout.fragment_reducir, container, false);
        tips = new ArrayList<Tip>();
        tips.add(new Tip("Cómo reducir los residuos","1. A la hora de escoger entre productos semejantes, elige aquel que tenga menos envase y embalaje. Evita el consumo de los productos excesivamente empaquetados. Ten en cuenta que esos envases también los pagas, en ocasiones el precio del envoltorio supera al del producto.\n" +
                "\n" +
                "2. Por regla general los envoltorios de cartón o papel y los envases de vidrio son los menos dañinos. No lo olvides al tener que optar entre productos.\n" +
                "\n" +
                "3. Cuando vayas a la compra no olvides llevar tu carro de la compra o la bolsa de lona o malla. En última instancia, reutiliza las bolsas que ya te han dado. Rechaza las bolsas que no necesitas, aunque insistan en regalártelas.\n" +
                "\n" +
                "4. Insiste al dependiente en que no te envuelvan los objetos que has comprado, salvo que sea imprescindible.\n" +
                "\n" +
                "5. Los productos en tamaño familiar, sean de lo que sea, generan menos residuo por unidad de producto. Tenlo en cuenta.\n" +
                "\n" +
                "6. Antes de comprar algo, atiende bien al etiquetado, donde se advierte de algunos riesgos y precauciones a tomar ¡pero no de todos los peligros!.\n" +
                "\n" +
                "7. Es necesario, especialmente en relación con el papel y el cartón, que pongamos en práctica la regla de las tres erres: Reducir, Reutilizar y Reciclar. Evitemos el consumo innecesario de papel y cartón, reutilicemos para otros usos los papeles y cartones que tengamos y, sólo cuando ya no nos sirva para absolutamente nada, será cuando debamos llevarlos a un contenedor para reciclar.\n" +
                "\n" +
                "8. Rechaza la publicidad que te ofrecen por la calle o invade tu buzón. Apúntate en la denominada \"Lista Robinsón\", para que sus empresas asociadas no te envíen publicidad por correo, escribiendo a la Asociación de Marketing Directo.\n" +
                "\n" +
                "9. Los papeles de imposible o difícil reciclaje (plastificados, encerados, de fax, etc.) sólo deberíamos emplearlos cuando no exista otra posibilidad menos impactante.\n" +
                "\n" +
                "10. El dicho \"lo barato sale caro\" sirve en muchas ocasiones. Desde zapatos hasta aparatos para el hogar elige aquellos que vayan a tener más larga duración y que puedan ser reparados en caso de avería o rotura... ¡y llévalos a arreglar cuando sea necesario!\n" +
                "\n" +
                "11. Los medicamentos caducados o que ya no vayas a necesitar, entrégalos en la farmacia."));
        tips.add(new Tip("CÓMO REDUCIR RESIDUOS EN LA ALIMENTACIÓN","12. Siempre que puedas compra los alimentos producidos lo más cerca posible a tu localidad. Ahorrarás embalajes y transporte.\n" +
                "\n" +
                "13. Cuando te sea posible, compra a granel. Así evitas embalajes innecesarios y decides la cantidad del producto que mejor se adecúa a tus necesidades.\n" +
                "\n" +
                "14. Rechaza de plano los alimentos presentados en bandejas de corcho blanco.\n" +
                "\n" +
                "15. En muchos sitios el agua del grifo es de buena calidad, no consumas sin necesidad agua embotellada.\n" +
                "\n" +
                "16. En las bebidas y líquidos opta por envases grandes y, cuando sea posible de vidrio; si es retornable, mejor.\n" +
                "\n" +
                "17. Evita en lo posible los \"brics\" y envases de plástico.\n" +
                "\n" +
                "18. No compres nada que venga embotellado en PVC.\n" +
                "\n" +
                "19. No consumas \"botes\" de bebidas, compra botellas de vidrio reutilizables.\n" +
                "\n" +
                "20. Rechaza los alimentos que vienen en \"bolsitas individuales\" dentro de un paquete más grande.\n" +
                "\n" +
                "21. Declara la guerra a los \"alimentos de diseño\": no son nutricionalmente buenos y por lo general vienen sobrempaquetados.\n" +
                "\n" +
                "22. Compra alimentos frescos, además de evitar envoltorios y envases, tu salud, tu paladar y tu bolsillo lo agradecerán.\n" +
                "\n" +
                "23. En ocasiones los envases (plásticos, botes, tetrabrics...) indican que son \"reciclables\", eso tan sólo significa que podrían ser reciclados, no que lo vayan a ser.\n" +
                "\n" +
                "24. No utilices sin ton ni son el papel de aluminio y \"plástico de envolver\". Cuando puedas reutilízalos.\n" +
                "\n" +
                "25. Evita en lo posible la comida \"lista para calentar en el microondas\"."));
        tips.add(new Tip("CÓMO REDUCIR RESIDUOS EN LA LIMPIEZA","26. Emplea detergentes sin fosfatos ni tensoactivos.\n" +
                "\n" +
                "27. Los detergentes \"recargables\" disminuyen impactos por el embalaje.\n" +
                "\n" +
                "28. La limpieza y la \"blancura\" no mejoran por usar más detergente del mínimo necesario.\n" +
                "\n" +
                "29. Para la limpieza de muchas superficies y tejidos los jabones naturales o neutros dan óptimos resultados.\n" +
                "\n" +
                "30. Los suavizantes son muy impactantes, reducen la vida de la ropa y pueden afectar a la piel. No los uses o empléalos sólo de vez en cuando.\n" +
                "\n" +
                "31. El vinagre sirve como detergente, fregasuelos, fijador del color de las prendas de lana y desengrasante.\n" +
                "\n" +
                "32. El bicarbonato sódico y el bórax son detergentes universales y sirven para blanquear la colada.\n" +
                "\n" +
                "33. Evita comprar ambientadores. Lo mejor es ventilar las habitaciones y, si acaso, colocar plantas aromáticas, \"popurris\" o vaporizadores de aceites esenciales."));
        tips.add(new Tip("CÓMO REDUCIR RESIDUOS EN EL ASEO Y LOS COSMÉTICOS","34. Rechaza los sobrempaquetados. El embalaje suele representar más de la mitad del precio y son una gran fuente de residuos de toda clase.\n" +
                "\n" +
                "35. Elige las presentaciones en barra (desodorante, crema de afeitar...) y los pulverizadores manuales.\n" +
                "\n" +
                "36. Las compresas y tampones nunca deben terminar en el inodoro, ¡ni mucho menos tirados en el campo o la playa!.\n" +
                "\n" +
                "37. Para el pelo utiliza champús suaves basados en hierbas o jabones neutros.\n" +
                "\n" +
                "38. No uses anticaspas a partir de sulfuro de selenio.\n" +
                "\n" +
                "39. Para el cuidado de la piel emplea jabones naturales o neutros, por lo general son más sanos. Pero no compres jabón liquido, sino en pastilla.\n" +
                "\n" +
                "40. Para la limpieza de los dientes usa gel basado en plantas medicinales o, aun mejor, perborato dental."));
        tips.add(new Tip("CÓMO REDUCIR RESIDUOS EN EL BRICOLAJE","41. Infórmate y calcula bien la cantidad que necesitas, evitarás derrochar y generar residuos innecesarios. Los frascos y botes de pinturas, barnices y otros productos de bricolaje son de difícil y problemática conservación una vez abiertos.\n" +
                "\n" +
                "42. Las pinturas al agua son mucho menos tóxicas y contaminantes. Actualmente están disponibles para casi todo tipo de aplicaciones.\n" +
                "\n" +
                "43. Los aerosoles desperdician mucho producto.\n" +
                "\n" +
                "44. Siempre que puedas aplica los productos con brocha, pincel o similares.\n" +
                "\n" +
                "45. Si te es imprescindible usa pistolas mecánicas o pulverizadores, pero nunca aerosoles.\n" +
                "\n" +
                "46. Los residuos de estos productos, incluidos los de la limpieza de brochas y pinceles, los del lijado de superficies tratadas, etc, llévalos a \"puntos limpios\"."));
        tips.add(new Tip("CÓMO REDUCIR RESIDUOS EN LAS PILAS","47. Si puedes evitarlo no uses aparatos a pilas. Los relojes mejor que sean automáticos y las calculadoras solares.\n" +
                "\n" +
                "48. Los aparatos mixtos (pilas y red) enchúfalos siempre que puedas. Ten en cuenta que la energía de las pilas cuesta hasta 450 veces más que la que suministra la red.\n" +
                "\n" +
                "49. Utiliza pilas recargables. Cuestan más pero a medio plazo son mucho más rentables.\n" +
                "\n" +
                "50. Evita las pilas-botón y, si tienes que comprarlas, elige las de litio, las de zinc-aire o las de óxido de plata, que no tienen o tienen muy poco mercurio.\n" +
                "\n" +
                "51. Para deshacerte de las pilas, deposítalas siempre en contenedores y en puntos de recogida."));
        tips.add(new Tip("CÓMO REDUCIR RESIDUOS DE INSECTICIDAS Y HERBICIDAS","52. Tampoco para estos cometidos emplees nunca aerosoles, en todo caso pulverizadores.\n" +
                "\n" +
                "53. Para las plagas de tus plantas de hogar hay muchos remedios caseros específicos tanto más eficaces que los insecticidas genéricos. Recurre a la sabiduría popular.\n" +
                "\n" +
                "54. Medio limón al que se han insertado clavos de olor o unos tiestos de albahaca en las ventanas son eficaces ahuyenta-insectos.\n" +
                "\n" +
                "55. Los repelentes de insectos para untarse el cuerpo pueden provocar problemas cutáneos y otros daños a la salud. Es mejor darse friegas de vinagre rebajado o, si prefieres, de aceite esencial de limón y lavanda mezclado con aceite de cocina."));
        tips.add(new Tip("COMO REDUCIR RESIDUOS EN LA ROPA","56. Recuerda que los tejidos naturales (lana, algodón, lino...) son mucho más fáciles de reciclar y menos contaminantes, tanto en su producción como en su conversión en residuo, que los sintéticos.\n" +
                "\n" +
                "57. Compra ropa de segunda mano.\n" +
                "\n" +
                "58. No tires ropa o calzado en buen estado simplemente porque \"ya no está de moda\".\n" +
                "\n" +
                "59. La ropa que ya no te vale puede venirle bien a otra gente. Regálala o entrégala a entidades benéficas.\n" +
                "\n" +
                "60. Reutiliza tu ropa inservible para otros usos, como trapos de cocina u otras mil cosas que se pueden hacer con los retales."));
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
            Log.e("ERROR FRAGMENT", "HAY QUE SOLUCIONAR EL PROBLEMA");
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
