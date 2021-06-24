val firstArg = if (!args.isEmpty) args(0) else ""

val result = 
firstArg match {
  case "salt" => "pepper"
  case "chips" => "salsa"
  case "eggs" => "bacon"
  case _ => "huh?"
}

println(result)