require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Commençons.

    state: Hello
        intent!: /hello
        a: Bonjour bonjour

    state: Bye
        intent!: /bye
        a: Au revoir

    state: NoMatch
        event!: noMatch
        a: Je ne comprends pas. Tu as dit: {{$request.query}}


