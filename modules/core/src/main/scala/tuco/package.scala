import tuco.free.{ connection => FC }
import tuco.free.{ telnetd    => FT }

import tuco.hi.{ connection      => HC }
import tuco.hi.{ basicterminalio => HBT }

package object tuco {

  type Config           = util.Config
  type Color            = util.Color
  type Expect           = util.Expect

  val Config       = util.Config
  val Color        = util.Color
  val Expect       = util.Expect

}
