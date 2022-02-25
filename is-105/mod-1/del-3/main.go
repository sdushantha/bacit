package main

import (
    "fmt"
    "github.com/sdushantha/is-105/mod-1/del-3/state"
)

func main(){

    fmt.Println(state.ViewState())

    //-----------------------------------------------//
    err := state.PutInBoat("HS kylling")             //
    if err != nil {                                  //
    fmt.Println(err)                                 //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
                                                     //
    err = state.CrossRiverTo("east")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
    //-----------------------------------------------//


    //-----------------------------------------------//
    err = state.PutInBoat("HS")                      //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
                                                     //
    err = state.CrossRiverTo("west")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
    //-----------------------------------------------//


    //-----------------------------------------------//
    err = state.PutInBoat("HS korn")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
                                                     //
    err = state.CrossRiverTo("east")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
    //-----------------------------------------------//


    //-----------------------------------------------//
    err = state.PutInBoat("HS kylling")              //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
                                                     //
    err = state.CrossRiverTo("west")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
    //-----------------------------------------------//


    //-----------------------------------------------//
    err = state.PutInBoat("HS rev")                  //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
                                                     //
    err = state.CrossRiverTo("east")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
    //-----------------------------------------------//


    //-----------------------------------------------//
    err = state.PutInBoat("HS")                      //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
                                                     //
    err = state.CrossRiverTo("west")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
    //-----------------------------------------------//


    //-----------------------------------------------//
    err = state.PutInBoat("HS kylling")              //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
                                                     //
    err = state.CrossRiverTo("east")                 //
    if err != nil {                                  //
        fmt.Println(err)                             //
        return                                       //
    }                                                //
    fmt.Println(state.ViewState())                   //
    //-----------------------------------------------//

    fmt.Println("\nDone :)")

}
