package  com.example.taskapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "position"

/**
 * A simple [Fragment] subclass.
 * Use the [ScondeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ScondeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var position: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            position = it.getInt(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sconde, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ScondeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    position?.let { putInt(ARG_PARAM2, it) }
                }
            }
    }
}