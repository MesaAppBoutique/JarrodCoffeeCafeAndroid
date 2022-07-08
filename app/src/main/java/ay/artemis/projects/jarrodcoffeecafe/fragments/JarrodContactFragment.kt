package ay.artemis.projects.jarrodcoffeecafe.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ay.artemis.projects.jarrodcoffeecafe.R



/*
* This fragment is for contact us screen.
* adding a onViewCreated to bind the xml layout for databinding purposes.
* adding the navigation with using the action part of fragment navigation.
* */
class JarrodContactFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jarrod_contact, container, false)
    }


}